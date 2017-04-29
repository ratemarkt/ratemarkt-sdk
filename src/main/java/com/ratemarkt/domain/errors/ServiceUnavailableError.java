package com.ratemarkt.domain.errors;

public class ServiceUnavailableError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public ServiceUnavailableError() {
		super();
	}

	public ServiceUnavailableError(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceUnavailableError(String message) {
		super(message);
	}

	@Override
	public int getApiErrorCode() {
		return 50001;
	}

	@Override
	public int getHttpStatusCode() {
		return 503;
	}

	@Override
	public String getCaption() {
		return "Service unavailable";
	}
}
