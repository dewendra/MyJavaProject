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

public class AgewisePodiumReports {


	public static long numOfRecords = 0;

	public static void main(String[] args) throws Exception {
		// Example event ID as a String (assuming it's alphanumeric)
		String eventId = "6684ff866ff9361402cfe592";
		int countPerPage = 1;
		String ageGroup = "7-12";
		String gender = "F";

		// Fetch and process leaderboard data
		JSONObject response = getDataFromAPI(eventId, countPerPage);
		if (response != null) {
			processLeaderBoardResponseJson(response, eventId);
		} else {
			System.out.println("No data received for event ID: " + eventId);
		}

		System.out.println("Number of records generated: " + numOfRecords);
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
		System.out.println("arraySize: " + arraySize);

		for (int i = 0; i < arraySize; i++) {
			numOfRecords++;
			JSONObject resultJSON = resultArray.getJSONObject(i);

			// Extract basic fields
			int runnerId = resultJSON.optInt("runnerId", 0);
			String name = resultJSON.optString("name", "N/A");
			String gender = resultJSON.optString("gender", "N/A");
			int rank = resultJSON.optInt("rank", -1);
			String ageGroup = resultJSON.optString("ageGroup", "N/A");

			// Initialize variables to store dataPoints
			int daysCompleted = 0;
			int totalPoints = 0;
			int challengesCompleted=0;
			int totalDistance = 0;
			String totalTime = "N/A";
			String pace = "N/A";

			// Extract dataPoints array
			if (resultJSON.has("dataPoints")) {
				JSONArray dataPoints = resultJSON.getJSONArray("dataPoints");
				for (int j = 0; j < dataPoints.length(); j++) {
					JSONObject dataPoint = dataPoints.getJSONObject(j);
					String dataType = dataPoint.optString("dataType", "");

					switch (dataType) {
					case "daysCompleted":
						daysCompleted = dataPoint.optInt("value", 0);
						break;
					case "totalPoints":
						totalPoints = dataPoint.optInt("value", 0);
						break;
					case "challengesCompleted":
						challengesCompleted = dataPoint.optInt("value", 0);
						break;
					case "totalDistance":
						totalDistance = dataPoint.optInt("value", 0);
						break;
					case "totalTime":
						JSONObject totalTimeObj = dataPoint.optJSONObject("value");
						if (totalTimeObj != null) {
							int hours = totalTimeObj.optInt("hours", 0);
							int minutes = totalTimeObj.optInt("minute", 0);
							int seconds = totalTimeObj.optInt("sec", 0);
							totalTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
						}
						break;
					case "pace":
						JSONObject paceObj = dataPoint.optJSONObject("value");
						if (paceObj != null) {
							int hours = paceObj.optInt("hours", 0);
							int minutes = paceObj.optInt("minute", 0);
							int seconds = paceObj.optInt("sec", 0);
							pace = String.format("%02d:%02d:%02d", hours, minutes, seconds);
						}
						break;
					default:
						// Handle other data types if necessary
						break;
					}
				}
			}

			// 100 Days Leaderboard data
			System.out.println(String.join(", ", String.valueOf(runnerId), name, ageGroup,  String.valueOf(rank), 
					 String.valueOf(totalPoints), String.valueOf(totalDistance), String.valueOf(challengesCompleted),
					 gender));
		}
	}

	/**
	 * Sends a POST request to the leaderboard API and retrieves the JSON response.
	 *
	 * @param eventId      Identifier for the event
	 * @param countPerPage Number of records to fetch per page
	 * @return JSONObject containing the API response, or null if the request fails
	 */
	public static JSONObject getDataFromAPI(String eventId,  int countPerPage) {

		//String ageGroup, String gender,
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
			postData1.put("key", "gender");
			postData1.put("value", "F");
			filters.put(postData1);
			
			postData1 = new JSONObject();
			postData1.put("key", "ageGroup");
			postData1.put("value", "60+");
			filters.put(postData1);
			
			JSONObject postData = new JSONObject();
			postData.put("reportType", "overall");
			postData.put("eventId", eventId);
			//postData.put("gender", gender);
			//postData.put("ageGroup", ageGroup);
			postData.put("countPerPage", countPerPage);
			postData.put("value", 0);
			postData.put("searchKey", "");
			postData.put("searchEnabled", false);
			postData.put("lastIndex", 0);
			postData.put("filters", filters);
			

			System.out.println("Post Data:" + postData);

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

			} else {
				System.out.println("------------- ERROR WHILE CALLING API --------------");
				System.out.println(urlConnection.getResponseCode());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("responseJson: " + responseJson);
		return responseJson;
	}



}
