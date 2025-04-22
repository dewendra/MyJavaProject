package com.gss.core.config;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:config.properties")
public class AppilcationProperites {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Value("${address.url}")
	private String address_url;
	
	@Value("${auth.token}")
	private String auth_token;
	
	@Value("${runner.ids}")
	private String runner_ids;
	
	@Value("${csv.file}")
	private String csv_file;
	
	
	@PostConstruct
	private void postConstruct() {
		logger.info("config properties");
		logger.info("address_url : " + address_url);
		logger.info("auth_token : " + auth_token);
		logger.info("runner_ids : " + runner_ids);
		logger.info("csv_file : " + csv_file);
		logger.info("-------------------");
	}


	public String getAddress_url() {
		return address_url;
	}


	public void setAddress_url(String address_url) {
		this.address_url = address_url;
	}


	public String getAuth_token() {
		return auth_token;
	}


	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}


	public String getRunner_ids() {
		return runner_ids;
	}


	public void setRunner_ids(String runner_ids) {
		this.runner_ids = runner_ids;
	}


	public String getCsv_file() {
		return csv_file;
	}


	public void setCsv_file(String csv_file) {
		this.csv_file = csv_file;
	}


	public Logger getLogger() {
		return logger;
	}

	
	
}
