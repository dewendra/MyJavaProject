package com.hdor.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class GeneratePodiumReportV2 {

    public static long numOfRecords = 0;

    public static void main(String[] args) throws Exception {
        // Example event ID as a String (assuming it's alphanumeric)
        String eventId = "674eab5f2e42bd701880caf0"; // Update with your actual event ID
        int countPerPage = 100; // You can adjust this value based on API limits

        int lastIndex = 0;
        int totalSize = Integer.MAX_VALUE; // Initialize to a large number
 
        
        // Loop to fetch all pages
        while (lastIndex <= totalSize) {
            // Fetch data from API with current lastIndex
            JSONObject response = getDataFromLeaderBoardAPI(eventId, countPerPage, lastIndex);
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

        for (int i = 0; i < arraySize; i++) {
            numOfRecords++;
            JSONObject resultJSON = resultArray.getJSONObject(i);

            // Extract basic fields
            int runnerId = resultJSON.optInt("runnerId", 0);
            String name = resultJSON.optString("name", "N/A");
            String gender = resultJSON.optString("gender", "N/A");
            int rank = resultJSON.optInt("rank", 0);
            String ageGroup = resultJSON.optString("ageGroup", "N/A");
            int age = resultJSON.optInt("age", 0);

            // Initialize variables to store dataPoints
            int activityCount=0;
            int totalPoints = 0;
            int totalDistance = 0;
            int totalSteps=0;
            int challengesCompleted = 0;
            int challengePoints=0;
            int completedIn=0;
            int daysCompleted=0;
            String bestTime = "N/A";
            String totalTime = "N/A";

            // Extract dataPoints array
            if (resultJSON.has("dataPoints")) {
                JSONArray dataPoints = resultJSON.getJSONArray("dataPoints");
                for (int j = 0; j < dataPoints.length(); j++) {
                    JSONObject dataPoint = dataPoints.getJSONObject(j);
                    String dataType = dataPoint.optString("dataType", "");

                    switch (dataType) {
                    case "activityCount":
						activityCount = dataPoint.optInt("value", 0);
						break;
                        case "totalPoints":
                            totalPoints = dataPoint.optInt("value", 0);
                            break;
                        case "totalDistance":
                            totalDistance = dataPoint.optInt("value", 0);
                            break;
                        case "totalSteps":
    						totalSteps = dataPoint.optInt("value", 0);
    						break;
                        case "challengesCompleted":
                            challengesCompleted = dataPoint.optInt("value", 0);
                            break;
                        case "challengePoints":
                        	challengePoints = dataPoint.optInt("value", 0);
                            break;
                        case "completedIn":
                        	completedIn = dataPoint.optInt("value", 0);
                            break;
                        case "daysCompleted":
                        	daysCompleted = dataPoint.optInt("value", 0);
                            break;
                        case "bestTime":
    						JSONObject timeValue = dataPoint.optJSONObject("value");
    						if (timeValue != null) {
    							int hours = timeValue.optInt("hours", 0);
    							int minutes = timeValue.optInt("minute", 0);
    							int seconds = timeValue.optInt("sec", 0);
    							bestTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
    						}
    						break;
                        case "totalTime":
                            JSONObject timeObj = dataPoint.optJSONObject("value");
                            if (timeObj != null) {
                                int hours = timeObj.optInt("hours", 0);
                                int minutes = timeObj.optInt("minute", 0);
                                int seconds = timeObj.optInt("sec", 0);
                                totalTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                            }
                            break;
                        default:
                            // Handle other data types if necessary
                            break;
                    }
                }
            }

            // Extract location information if available
//            String state = resultJSON.optString("state", "N/A");
//            String country = resultJSON.optString("country", "N/A");
            
            //India and International race series 
			  System.out.println(String.join(", ", String.valueOf(runnerId), name,
			  String.valueOf(rank), String.valueOf(activityCount), bestTime ));

            //TDH 
//              System.out.println(String.join(", ", String.valueOf(runnerId), name, gender,
//     		  String.valueOf(rank),String.valueOf(totalDistance),String.valueOf(totalPoints)));
            
            //100 Days of Running
//			  System.out.println(String.join(", ", String.valueOf(runnerId), name, gender,
//			  String.valueOf(rank),String.valueOf(totalPoints),String.valueOf(totalDistance),String.valueOf(daysCompleted)));
            
            //BMI Running
//			  System.out.println(String.join(", ", String.valueOf(runnerId), name, gender,
//			  String.valueOf(rank),String.valueOf(totalPoints),String.valueOf(totalDistance),String.valueOf(daysCompleted)));
			
			 
			//100 Days of steps Challenge
//			  System.out.println(String.join(", ", String.valueOf(runnerId), name, gender,
//			  String.valueOf(rank),String.valueOf(totalPoints),String.valueOf(totalSteps),String.valueOf(challengesCompleted)));
				
            //Annual challenge - 1000km,2021Km, 1000Miles, 2021Miles..
//			  System.out.println(String.join(", ", String.valueOf(runnerId), name, 
//			  String.valueOf(rank),String.valueOf(totalDistance),String.valueOf(completedIn),eventId));
              
		    //Annual challenge - 5km run,10km ride..
//			  System.out.println(String.join(", ", String.valueOf(runnerId), name, 
//			  String.valueOf(rank),String.valueOf(activityCount),eventId));
              
            //Annual Destination challenge(Himalaya Run, GQ Run etc)
//            System.out.println(String.join(", ", String.valueOf(runnerId), name, 
//			  String.valueOf(rank),String.valueOf(totalDistance),String.valueOf(completedIn),eventId));
              
            //Annual steps Challenge
//              System.out.println(String.join(", ", String.valueOf(runnerId), name, gender,
//     		  String.valueOf(rank),String.valueOf(activityCount),String.valueOf(totalSteps),eventId));
			  
			//John Deere 2024
//			  System.out.println(String.join(", ", String.valueOf(runnerId), name, 
//			  String.valueOf(rank),String.valueOf(totalSteps)));
        }
    }

    /**
     * Sends a POST request to the leaderboard API and retrieves the JSON response.
     *
     * @param eventId      Identifier for the event
     * @param countPerPage Number of records to fetch per page
     * @param lastIndex    Index of the last item fetched in previous request
     * @return JSONObject containing the API response, or null if the request fails
     */
    public static JSONObject getDataFromLeaderBoardAPI(String eventId, int countPerPage, int lastIndex) {
        URL apiURL;
        HttpURLConnection urlConnection = null;
        JSONObject responseJson = null;

        try {
            // Define the API endpoint
            String strURL = "https://apiv2.hdor.com/report/report/overall/list";
            apiURL = new URL(strURL);

            // Open the connection
            if (strURL.toLowerCase().startsWith("https")) {
                urlConnection = (HttpsURLConnection) apiURL.openConnection();
            } else {
                urlConnection = (HttpURLConnection) apiURL.openConnection();
            }

            // Configure the connection
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json; utf-8");
            urlConnection.setRequestProperty("Accept", "application/json");
            // Uncomment the next line if authentication is required
            // urlConnection.setRequestProperty("Authorization", getBasicAuthHeader());
            urlConnection.setDoOutput(true);

            // Create the JSON payload
            JSONObject postData = new JSONObject();
            postData.put("reportType", "overall");
            postData.put("eventId", eventId);
            postData.put("countPerPage", countPerPage);
            postData.put("gender", "all");
            postData.put("lastIndex", lastIndex);

            // Send the POST request
            try (OutputStream outputStream = urlConnection.getOutputStream()) {
                byte[] requestBytes = postData.toString().getBytes(StandardCharsets.UTF_8);
                outputStream.write(requestBytes);
                outputStream.flush();
            }

            // Check the response code
            int responseCode = urlConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                try (BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8))) {
                    StringBuilder responseBuilder = new StringBuilder();
                    String line;

                    while ((line = bufferedReader.readLine()) != null) {
                        responseBuilder.append(line);
                    }

                    // Parse the JSON response
                    responseJson = new JSONObject(responseBuilder.toString());
                   // System.out.println("response Json:"+responseJson);
                }
            } else {
                System.err.println("ERROR: API call failed with response code " + responseCode);
                // Optionally, read the error stream for more details
                try (BufferedReader errorReader = new BufferedReader(
                        new InputStreamReader(urlConnection.getErrorStream(), StandardCharsets.UTF_8))) {
                    StringBuilder errorBuilder = new StringBuilder();
                    String line;
                    while ((line = errorReader.readLine()) != null) {
                        errorBuilder.append(line);
                    }
                    System.err.println("Error details: " + errorBuilder.toString());
                }
            }

        } catch (Exception e) {
            System.err.println("Exception occurred while calling the API:");
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }

        return responseJson;
        
    }

    
    /**
     * Generates a Basic Authentication header.
     *
     * **Security Notice:** Hardcoding credentials is insecure. Consider using environment variables or a secure vault.
     *
     * @return A string representing the Basic Auth header
     */
    public static String getBasicAuthHeader() {
        String basicAuthHeader = null;
        // Replace with secure credential handling in production
        String authString = "username:password"; // Replace with actual credentials
        byte[] credBytes = Base64.getEncoder().encode(authString.getBytes(StandardCharsets.UTF_8));
        basicAuthHeader = "Basic " + new String(credBytes);
        return basicAuthHeader;
    }}
