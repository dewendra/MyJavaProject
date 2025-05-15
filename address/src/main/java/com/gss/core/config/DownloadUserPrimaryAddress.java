package com.gss.core.config;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;

@Service
public class DownloadUserPrimaryAddress {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AppilcationProperites config;


	public void download() {

		logger.debug("Donwloading user primar address");

		List<String[]> csvRows = new ArrayList<>();
		csvRows.add(new String[]{
				"runnerId", "firstName", "lastName","mobile","address1", "address2",
				"landmark", "country","state","city","pincode"
				
		});
// "label",  "mobileCode", "countryId", "stateId", "cityId",
		try {

			String content = Files.readString(Paths.get(config.getRunner_ids()));
			String[] runnerIds = content.split(",");


			for (String runnerIdRaw : runnerIds) {

				String runnerId = runnerIdRaw.trim();

				logger.debug("Fetchting address for runnerId {}",runnerId);

				String response = fetchRunnerAddress(runnerId);

				if (response != null) {

					ObjectMapper mapper = new ObjectMapper();

					JsonNode root = mapper.readTree(response);

					if (root.path("status").asBoolean()) {

						JsonNode data = root.path("data");
						csvRows.add(new String[]{
								runnerId,
								data.path("firstName").asText(),
								data.path("lastName").asText(),
								data.path("mobile").asText(),
								data.path("address1").asText(),
								data.path("address2").asText(),
								data.path("landmark").asText(),
								data.path("country").asText(),
								data.path("state").asText(),
								data.path("city").asText(),
								data.path("pincode").asText()
								
//								data.path("label").asText(),
//								data.path("mobileCode").asText(),
//								data.path("countryId").asText(),
//								data.path("stateId").asText(),
//								data.path("cityId").asText(),
								
						});
					}
				}

				Thread.sleep(2000);
				logger.debug("---------------------------------------------------------------");
			}

			try (CSVWriter writer = new CSVWriter(new FileWriter(config.getCsv_file()))) {
				writer.writeAll(csvRows);
				logger.debug("CSV written to {}",config.getCsv_file());
			}


		}catch (Exception e) {
			e.printStackTrace();
		}
	}


	private  String fetchRunnerAddress(String runnerId) {
		try {
			URL url = new URL(config.getAddress_url() + runnerId);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Application", "web");
			conn.setRequestProperty("Authorization", "Bearer " + config.getAuth_token());

			int status = conn.getResponseCode();
			if (status == 200) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				StringBuilder responseBuilder = new StringBuilder();
				String line;

				while ((line = reader.readLine()) != null) {
					responseBuilder.append(line);
				}
				reader.close();
				return responseBuilder.toString();
			} else {
				System.err.println("Failed for runnerId " + runnerId + " with status code " + status);
			}
		} catch (Exception e) {
			System.err.println("Exception for runnerId " + runnerId + ": " + e.getMessage());
		}
		return null;
	}

}
