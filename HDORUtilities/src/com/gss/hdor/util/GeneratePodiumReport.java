package com.gss.hdor.util;

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

public class GeneratePodiumReport {

	public static long numOfRecords = 0;

	public static void main(String[] args) throws Exception {

		// String[] ageGroupArray =
		// {"7-12","13-18","19-29","30-39","40-49","50-59","60-69","70-ABOVE"};
		//
		// for(int eventId = 269;eventId<270;eventId++) {
		// System.out.println("************************"+ " Event Id: " + eventId + "
		// *******************************************");
		// for(String ageGroup : ageGroupArray) {
		// System.out.println("----------- " + ageGroup + " --- MALE ------- ");
		// processResponseJson(getDataFromAPI(eventId, ageGroup,
		// "Male"),eventId,ageGroup);
		// System.out.println("----------- " + ageGroup + " --- FEMALE ------- ");
		// processResponseJson(getDataFromAPI(eventId, ageGroup,
		// "Female"),eventId,ageGroup);
		// }
		// System.out.println("*******************************************************************");
		// System.out.println();
		// }

		// for(int eventId = 17;eventId<21;eventId++) {
		// processLeaderBoardResponseJson(getDataFromLeaderBoardAPI(eventId, 1000),
		// eventId);
		// System.out.println("\n********************************\n");
		//// break;
		// }
		// for(int eventId = 182;eventId<186;eventId++) {
		// processLeaderBoardResponseJson(getDataFromLeaderBoardAPI(eventId, 1000),
		// eventId);
		// System.out.println();
		//// System.out.println("********************************");
		//// System.out.println();
		// }

		// for 100 days of running result
		// processLeaderBoardResponseJson(getDataFromLeaderBoardAPI(752, 20000), 752);

		// 100days Leaderboard data
		//processLeaderBoardResponseJson(getDataFromAPI(934, "70-ABOVE", "Female"),934);

		// for TDH result
		// processLeaderBoardResponseJson(getDataFromLeaderBoardAPI(555, 5000), 555);

		// System.out.println();

		// for everyone
		processLeaderBoardResponseJson(getDataFromLeaderBoardAPI(886, 20000), 886);

		// Firefox
		// processLeaderBoardResponseJson(getDataFromLeaderBoardAPI(555, 1500), 555);

		System.out.println("Number of records generated: " + numOfRecords);
	}

	public static void processLeaderBoardResponseJson(JSONObject response, int eventId) throws Exception {
		// System.out.println(response);
		// System.out.println("FitId,Name,EventDistance,BestTime,Rank,Attemps,City,State,EventId");

		JSONArray resultArray = response.getJSONArray("resultList");
		int arraySize = resultArray.length();
		for (int i = 0; i < arraySize; i++) {
			numOfRecords++;
			JSONObject resultJSON = resultArray.getJSONObject(i);

			// System.out.println(resultJSON.toString());
			// System.out.println("Arrray Size:"+ arraySize);

			// break;
			// System.out.println(resultJSON.getInt("runnerId") + "," +
			// resultJSON.getString("email")+ "," + resultJSON.getString("name")+"," +
			// resultJSON.getBoolean("completed")
			// +"," + resultJSON.getString("city")+"," + resultJSON.getString("state")+"," +
			// resultJSON.getString("country")+ "," + resultJSON.getInt("rank") +"," +
			// resultJSON.getInt("totalDistance")+","+eventId );

			// TDH Result..
//			System.out.println(resultJSON.optInt("runnerId") + "," + resultJSON.optString("name") + ","
//					+ resultJSON.optString("gender") + "," + resultJSON.optInt("rank") + ","
//					+ resultJSON.optInt("totalDistance") + "," + resultJSON.optInt("totalPoints", 0) + ","
//					+ resultJSON.optInt("rideCount") + "," + resultJSON.optString("finisherLevel") + ","
//					+ resultJSON.optString("city") + "," + resultJSON.optString("state") + ","
//					+ resultJSON.optString("country") + "," + eventId);

			// KCC Result..
			// System.out.println(
			// resultJSON.optInt("runnerId") + ","
			// + resultJSON.optString("name") + ","
			// + resultJSON.optString("gender") + ","
			// + resultJSON.optBoolean("completedLevel1")+","
			// + resultJSON.optBoolean("completedLevel2")+","
			// + resultJSON.optInt("rank")+ ","
			// + resultJSON.optInt("totalDistance") + ","
			// + resultJSON.optInt("maxDistance") + ","
			// + resultJSON.optString("runningGroup") + ","
			// + resultJSON.optString("city") + ","
			// + resultJSON.optString("state") + ","
			// + resultJSON.optString("country") + "," + eventId);

			// 100 Days Of Running..runningGroup

			// System.out.println(resultJSON.getInt("runnerId") + ","
			// + resultJSON.getInt("runCount") + ","
			// + eventId);

			// 100 Days Leaderboard data
//		    	System.out.println(resultJSON.getInt("runnerId") + ","
//			      + resultJSON.getString("name") + ","
//            	  + resultJSON.getString("gender") + ","
//			      + resultJSON.getInt("rank") + ","
//			      + resultJSON.getInt("daysCompleted") + ","
//            	  + resultJSON.getInt("points") + "," 
//            	  + resultJSON.optString("runningGroup") + ","
//            	  + resultJSON.optString("companyName") + ","
//			      + resultJSON.getInt("totalDistance") + ","
//                  + eventId);

			// 100 Trophy data Days result
//			 System.out.println(resultJSON.getInt("runnerId") + ","
//			 + resultJSON.getString("name") + ","
//			 + resultJSON.getString("gender") + ","
//			 + resultJSON.getInt("rank") + ","
//			 + resultJSON.getInt("daysCompleted") + ","
//			 + resultJSON.getInt("points") + ","
//			 + resultJSON.getInt("totalDistance") + ","
//			 + resultJSON.getString("country") + ","
//			 + resultJSON.getString("state") + ","
//			 + resultJSON.getString("city") + ","
//             + eventId);
			//
			// Freedom Race Leaderboard data
			// System.out.println(resultJSON.getInt("runnerId") + "," +
			// resultJSON.getString("name") + ","
			// + resultJSON.getString("gender") + "," + resultJSON.getInt("bestTime") +
			// ","+resultJSON.getInt("rank")+","+ eventId);

			// freedom run / ootyUltra
			// System.out.println(resultJSON.getInt("runnerId") + "," +
			// resultJSON.getString("name")
			// +"," + resultJSON.getString("gender")+"," + resultJSON.getInt("bestTime") +
			// "," + resultJSON.getString("runningGroup") + "," +
			// resultJSON.getString("city")+"," + resultJSON.getString("state")+"," +
			// resultJSON.getString("country")+ "," + resultJSON.getInt("rank") +"," +
			// resultJSON.optString("bestEffortLink","NA")+","+
			// resultJSON.getFloat("totalDistance")+"," + resultJSON.getInt("totalTime") +
			// "," + resultJSON.getInt("noOfAttempts") + "," + eventId );

			// India and International race series
						 System.out.println(resultJSON.getInt("runnerId") + "," + resultJSON.getString("name")
						 +"," + resultJSON.optInt("eventDistance")+"," + resultJSON.optInt("bestTime")+"," +
						 	 resultJSON.getInt("rank")+"," + resultJSON.optInt("noOfAttempts")+"," + 
								  resultJSON.getString("state")+"," + 
								 resultJSON.getString("country")+ "," + eventId );

			// 100 Days of steps Challenge finisherLevel
//			 System.out.println(resultJSON.getInt("runnerId") + "," +
//			 resultJSON.getString("name") + "," + resultJSON.getString("finisherLevel") +
//			 "," + resultJSON.optInt("challengesCompleted", 0)
//			 +"," + resultJSON.getInt("totalPoints")+"," +
//			 resultJSON.getInt("challengePoints")+"," +
//			 resultJSON.getInt("bonusPoints")+"," + resultJSON.getInt("rank")+"," +
//			 resultJSON.getString("city")+"," +resultJSON.getString("state")+"," +
//			 resultJSON.getString("country")+ "," + eventId );
			
			// Annual steps Challenge 
//						 System.out.println(resultJSON.getInt("runnerId") + "," +
//						 resultJSON.optInt("rank")+"," +
//						 resultJSON.getString("name") + "," + 
//						 resultJSON.optInt("noOfAttempts")+"," +
//									/* resultJSON.getString("finisherLevel") + "," + */
//						 resultJSON.getString("gender") + "," + 
//						 resultJSON.optInt("totalSteps")+"," +
//						 resultJSON.optInt("avgSteps")+"," +
//						 eventId );

			// takedown challenge
			// System.out.println(resultJSON.getInt("runnerId") + "," +
			// resultJSON.getString("name")
			// +"," + resultJSON.getInt("runUniqueChallengesCompleted")+"," +
			// resultJSON.getInt("rideUniqueChallengesCompleted")+"," +
			// + resultJSON.optInt("totalPoints", 0) + "," +
			// resultJSON.getBoolean("finisher")+"," + resultJSON.getInt("rank")+"," +
			// resultJSON.getString("city")+"," +resultJSON.getString("state")+"," +
			// resultJSON.getString("country")+ "," + eventId );

			Integer gold = 0;
			Integer silver = 0;
			Integer bronze = 0;

			
			
			JSONArray array = resultJSON.optJSONArray("finisherLevels");

			if (null != array && array.length() > 0) {

				JSONObject finisherObject;

				for (int q = 0; q < array.length(); q++) {

					finisherObject = array.optJSONObject(q);

					if (null != finisherObject) {

						if (finisherObject.has("level") && finisherObject.has("minimumAchievement")) {

							switch (finisherObject.getString("level")) {
							case "gold":
								gold = finisherObject.optInt("minimumAchievement");
								break;

							case "silver":
								silver = finisherObject.optInt("minimumAchievement");
								break;

							case "bronze":
								bronze = finisherObject.optInt("minimumAchievement");
								break;

							default:
								break;
							}
						}

					}

				}

			}

			// annual challenge - 5km run,10km ride..
//			System.out.println(resultJSON.getInt("runnerId") + "," +
//					resultJSON.getString("name")+"," + resultJSON.getInt("eventDistance") + ","
//					+resultJSON.optBoolean("completed",false)+"," +
//					resultJSON.optInt("totalDistance",0) +"," +
//					gold + "," + silver + "," + bronze + "," + 
//					resultJSON.getInt("noOfAttempts")+"," + resultJSON.getString("state")+"," +
//					resultJSON.getString("country")+ "," + eventId );

			// annual challenge - 1000km,2021Km, 1000Miles, 2021Miles..
//			 System.out.println(resultJSON.getInt("runnerId") + "," +
//			 resultJSON.getString("name")+"," + resultJSON.getInt("eventDistance")
//			 +"," + resultJSON.getInt("totalDistance")
//			 +"," + resultJSON.getBoolean("completed")+"," +
//			 resultJSON.getString("city")+"," +
//			 resultJSON.getString("state")+"," +
//			 resultJSON.getString("country")+ "," + eventId );

			// Annual Destination challenge(Himalaya Run, GQ Run etc)
//			System.out.println(resultJSON.getInt("runnerId") + "," + resultJSON.getString("name") + ","
//					+ resultJSON.getInt("eventDistance") + "," + resultJSON.getInt("totalDistance") + ","
//					+ resultJSON.getBoolean("completed") + ","+ resultJSON.getInt("totalDays") + ","+ resultJSON.getInt("daysInto") + "," + resultJSON.getInt("daysLeft") + "," + resultJSON.getInt("noOfAttempts") + "," + eventId);

			// Firefox Firestrom..
			// System.out.println(resultJSON.getInt("runnerId") + "," +
			// resultJSON.getString("name")+","+resultJSON.getInt("rank")+"," +
			// resultJSON.getInt("totalDistance")
			// +","+ resultJSON.optInt("totalPoints", 0) +
			// ","+resultJSON.optString("finisherLevel")+"," +
			// resultJSON.getString("city")+"," +
			// resultJSON.getString("state")+"," +
			// resultJSON.getString("country")+ "," + eventId );

			// atlassian
			// System.out.println(resultJSON.getInt("runnerId") + "," +
			// resultJSON.getString("name")+"," + resultJSON.getInt("runCount")
			// +"," + resultJSON.getInt("totalDistance") +"," +
			// resultJSON.getInt("totalTime")
			// +"," + resultJSON.getInt("longestRun")+"," + resultJSON.getString("city")+","
			// +
			// resultJSON.getString("state")+"," +
			// resultJSON.getString("country")+ "," + eventId );

			// break;

		}
		// System.out.println("-----------------");
	}

	// public static void processResponseJson(JSONObject response,int eventId,String
	// ageGroup) {
	// for(Object result : response.getJSONArray("resultList")) {
	// JSONObject resultJSON = (JSONObject) result;
	//// System.out.println(resultJSON.keySet());
	// System.out.println(resultJSON.getInt("runnerId") + "," +
	// resultJSON.getString("name")+"," + resultJSON.getString("gender")
	// +"," + resultJSON.getString("city")+"," + resultJSON.getString("state")+"," +
	// resultJSON.getString("country")+"," + ageGroup + "," +
	// resultJSON.getInt("rank") +"," +
	// resultJSON.getInt("bestTime")+","+resultJSON.getInt("totalDistance")+","+eventId
	// );
	// }
	// // System.out.println("-----------------");
	// }

	public static JSONObject getDataFromLeaderBoardAPI(int eventId, int countPerPage) {

		URL apiURL = null;
		HttpURLConnection urlConnection = null;
		JSONObject responseJson = null;

		try {
			// Old API
			// String strURL = "https://api.hdor.com/hdor/reports/pgn/leaderboard.htm";

			// New API
			String strURL = "https://api.hdor.com/reports/reports/leaderboard";

			apiURL = new URL(strURL);

			if (strURL.toLowerCase().startsWith("https")) {
				urlConnection = (HttpsURLConnection) apiURL.openConnection();
			} else {
				urlConnection = (HttpURLConnection) apiURL.openConnection();
			}

			urlConnection.setRequestMethod("POST");
			urlConnection.setRequestProperty("Content-Type", "application/json; utf-8");
			urlConnection.setRequestProperty("Accept", "application/json");

			// urlConnection.setRequestProperty("Authorization", getBasicAuthHeader());

			urlConnection.setDoOutput(true);

			JSONObject postData = new JSONObject();

			postData.put("reportType", "overall");
			postData.put("eventId", eventId);
			postData.put("countPerPage", countPerPage);
			postData.put("gender", "all");
			postData.put("lastIndex", 0);

			// System.out.println(postData);

			OutputStream outputStream = urlConnection.getOutputStream();
			byte[] requestJsonBytes = postData.toString().getBytes();
			outputStream.write(requestJsonBytes, 0, requestJsonBytes.length);

			if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(urlConnection.getInputStream()));

				StringBuffer output = new StringBuffer();
				String response = bufferedReader.readLine();

				while (null != response) {
					output.append(response);
					response = bufferedReader.readLine();
				}

				// System.out.println(output);
				urlConnection.disconnect();

				responseJson = new JSONObject(output.toString());

				// System.out.println(responseJson.toString(5));

				// apiResponseObject =
				// Configuration.defaultConfiguration().jsonProvider().parse(output.toString());

				// apiResponse =
				// JsonPath.using(Configuration.defaultConfiguration().addOptions(Option.ALWAYS_RETURN_LIST,Option.SUPPRESS_EXCEPTIONS)).parse(output.toString());

			} else {
				System.out.println("------------- ERROR WHILE CALLING API --------------");
				System.out.println("------------- ERROR WHILE CALLING API --------------");
				System.out.println(urlConnection.getResponseCode());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return responseJson;

	}

	public static JSONObject getDataFromAPI(int eventId, String ageGroup, String gender) {

		URL apiURL = null;
		HttpURLConnection urlConnection = null;
		JSONObject responseJson = null;

		try {

			// String strURL = "https://api.hdor.com/hdor/reports/pgn/ageGroupReports.htm";
			// New API
			// String strURL = "https://api.hdor.com/reports/reports/leaderboard";
			// String strURL = "https://api.hdor.com/hdor/reports/pgn/leaderboard.htm";
			// Freedomrace leaderboard url
			String strURL = "https://api.hdor.com/reports/reports/leaderboard/agewise";
			// String strURL="https://api.hdor.com/reports/reports/leaderboard";

			apiURL = new URL(strURL);

			if (strURL.toLowerCase().startsWith("https")) {
				urlConnection = (HttpsURLConnection) apiURL.openConnection();
			} else {
				urlConnection = (HttpURLConnection) apiURL.openConnection();
			}

			urlConnection.setRequestMethod("POST");
			urlConnection.setRequestProperty("Content-Type", "application/json; utf-8");
			urlConnection.setRequestProperty("Accept", "application/json");

			// urlConnection.setRequestProperty("Authorization", getBasicAuthHeader());

			urlConnection.setDoOutput(true);

			JSONObject postData = new JSONObject();
			postData.put("reportType", "overall");
			postData.put("eventId", eventId);
			postData.put("countPerPage", 3);
			postData.put("value", 0);
			postData.put("searchKey", "");
			postData.put("searchEnabled", false);
			postData.put("gender", gender);
			postData.put("lastIndex", 0);
			postData.put("ageGroup", ageGroup);
			// postData.put("category",category);

			System.out.println(postData);

			OutputStream outputStream = urlConnection.getOutputStream();
			byte[] requestJsonBytes = postData.toString().getBytes();
			outputStream.write(requestJsonBytes, 0, requestJsonBytes.length);

			if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(urlConnection.getInputStream()));

				StringBuffer output = new StringBuffer();
				String response = bufferedReader.readLine();

				while (null != response) {
					output.append(response);
					response = bufferedReader.readLine();
				}

				// System.out.println(output);
				urlConnection.disconnect();

				responseJson = new JSONObject(output.toString());

				// System.out.println(responseJson.toString(5));

				// apiResponseObject =
				// Configuration.defaultConfiguration().jsonProvider().parse(output.toString());

				// apiResponse =
				// JsonPath.using(Configuration.defaultConfiguration().addOptions(Option.ALWAYS_RETURN_LIST,Option.SUPPRESS_EXCEPTIONS)).parse(output.toString());

			} else {
				System.out.println("------------- ERROR WHILE CALLING API --------------");
				System.out.println(urlConnection.getResponseCode());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return responseJson;

	}

	public static String getBasicAuthHeader() {
		String basicAuthHeader = null;
		if (true) {
			String authString = "dewendra.singh@pensar.in:kanchandevi";
			byte[] credBytes = Base64.getEncoder().encode(authString.getBytes(StandardCharsets.UTF_8));
			basicAuthHeader = "Basic " + new String(credBytes);
		}
		return basicAuthHeader;
	}

}
