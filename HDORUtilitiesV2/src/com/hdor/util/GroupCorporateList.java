package com.hdor.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class GroupCorporateList {


	public static long numOfRecords = 0;

	public static void main(String[] args) throws Exception {
        // Example event ID as a String (assuming it's alphanumeric)
        String eventId = "6793170613afdbd403fd9342"; // Update with your actual event ID
        int countPerPage = 100; // You can adjust this value based on API limits

        int lastIndex = 0;
        int totalSize = Integer.MAX_VALUE; // Initialize to a large number

        
        // Loop to fetch all pages
        while (lastIndex <= totalSize) {
            // Fetch data from API with current lastIndex
            JSONObject response = getDataFromAPI(eventId, countPerPage);
            if (response != null) {
                // Process the response
                processLeaderBoardResponseJson(response, eventId);
                // Update lastIndex and totalSize based on the response
                JSONObject filter = response.optJSONObject("filter");
                if (filter != null) {
                    lastIndex = filter.optInt("lastIndex", lastIndex); // Move to next index
                    totalSize = filter.optInt("totalSize", totalSize);
                } else {
                    // If filter info is not available, break the loop
                    break;
                }
               
            } else {
                System.out.println("No data received for event ID: " + eventId);
                break;
            }
            
            if(totalSize==numOfRecords) {
            	System.out.println("Number of records generated: " + numOfRecords);
            	
            	break;
            }
        }

        //System.out.println("Number of records generated: " + numOfRecords);
    }

	/**
	 * Processes the leaderboard JSON response and prints relevant details.
	 *
	 * @param response JSON response from the leaderboard API
	 * @param eventId  Identifier for the event
	 * @throws Exception if JSON parsing fails
	 */
	public static void processLeaderBoardResponseJson(JSONObject response, String eventId) throws Exception {
		if (!response.has("list")) {
			System.out.println("No 'list' found in the response.");
			return;
		}

		JSONArray resultArray = response.getJSONArray("list");
		int arraySize = resultArray.length();
		//System.out.println("arraySize: " + arraySize);

		for (int i = 0; i < arraySize; i++) {
			numOfRecords++;
			JSONObject resultJSON = resultArray.getJSONObject(i);

			// Extract basic fields
			int runnerId = resultJSON.optInt("runnerId", 0);
			String name = resultJSON.optString("name", "N/A");
			int rank = resultJSON.optInt("rank", 0);
			int member = resultJSON.optInt("member", 0);
			

			// Initialize variables to store dataPoints
			
			int totalPoints = 0;
			int totalDistance = 0;
			int daysCompleted=0;
			

			// Extract dataPoints array
			if (resultJSON.has("dataPoints")) {
				JSONArray dataPoints = resultJSON.getJSONArray("dataPoints");
				for (int j = 0; j < dataPoints.length(); j++) {
					JSONObject dataPoint = dataPoints.getJSONObject(j);
					String dataType = dataPoint.optString("dataType", "");

					switch (dataType) {
					case "totalPoints":
						totalPoints = dataPoint.optInt("value", 0);
						break;
					case "totalDistance":
						totalDistance = dataPoint.optInt("value", 0);
						break;
					case "daysCompleted":
                    	daysCompleted = dataPoint.optInt("value", 0);
                        break;
					default:
						// Handle other data types if necessary
						break;
					}
				}
			}

			// 100 Days Leaderboard data
			System.out.println(String.join(", ", String.valueOf(runnerId),  name, String.valueOf(rank),  
					 String.valueOf(totalPoints), String.valueOf(totalDistance),String.valueOf(daysCompleted)));
		}
	}

	/**
	 * Sends a POST request to the leaderboard API and retrieves the JSON response.
	 *
	 * @param eventId      Identifier for the event
	 * @param countPerPage Number of records to fetch per page
	 * @return JSONObject containing the API response, or null if the request fails
	 */
	public static JSONObject getDataFromAPI(String eventId, int countPerPage) {

		URL apiURL = null;
		HttpURLConnection urlConnection = null;
		JSONObject responseJson = null;

		try {

			String strURL = "https://apiv2.hdor.com/report/report/overall/list";

			apiURL = new URL(strURL);

			if (strURL.toLowerCase().startsWith("https")) {
				urlConnection = (HttpsURLConnection) apiURL.openConnection();
			} else {
				urlConnection = (HttpURLConnection) apiURL.openConnection();
			}

			urlConnection.setRequestMethod("POST");
			urlConnection.setRequestProperty("Content-Type", "application/json; utf-8");
			urlConnection.setRequestProperty("Accept", "application/json");

			urlConnection.setDoOutput(true);

			JSONArray filters=new JSONArray();
			JSONObject postData1 = new JSONObject();
			
			postData1 = new JSONObject();
			postData1.put("key", "gender");
			postData1.put("value", "all");
			filters.put(postData1);
			
			postData1 = new JSONObject();
			postData1.put("key", "ageGroup");
			postData1.put("value", "all");
			filters.put(postData1);
			
			postData1 = new JSONObject();
			postData1.put("key", "group");
			postData1.put("value", "1128");
			filters.put(postData1);
			
			postData1 = new JSONObject();
			postData1.put("key", "corporate");
			postData1.put("value", "1425");//Gateway software Solutions
			//filters.put(postData1);
			
			
			JSONObject postData = new JSONObject();
			//postData.put("reportType", "overall");
			postData.put("eventId", eventId);
			//postData.put("entity", entity);
			postData.put("countPerPage", countPerPage);
			//postData.put("value", 0);
			//postData.put("searchKey", "");
			//postData.put("searchEnabled", false);
			postData.put("lastIndex", 0);
			postData.put("filters", filters);
			

			//System.out.println("Post Data:" + postData);

			OutputStream outputStream = urlConnection.getOutputStream();
			byte[] requestJsonBytes = postData.toString().getBytes(StandardCharsets.UTF_8);
			outputStream.write(requestJsonBytes, 0, requestJsonBytes.length);

			if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

				StringBuilder output = new StringBuilder();
				String response = bufferedReader.readLine();

				while (null != response) {
					output.append(response);
					response = bufferedReader.readLine();
				}

				urlConnection.disconnect();

				responseJson = new JSONObject(output.toString());
				//System.out.println("Rsponse JSON :" +responseJson);

			} else {
				System.out.println("------------- ERROR WHILE CALLING API --------------");
				System.out.println(urlConnection.getResponseCode());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("responseJson: " + responseJson);
		return responseJson;
	}

	
	







}
