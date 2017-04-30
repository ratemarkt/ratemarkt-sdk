package com.ratemarkt.connectors.ratemarkt;

public class RatemarktConfig {

	public static final String DEFAULT_BASE_URL = "http://localhost:8080/api/v1/";

	private String baseUrl = DEFAULT_BASE_URL;
	private String apiKey;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

}
