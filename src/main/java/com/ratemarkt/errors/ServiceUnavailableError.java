package com.ratemarkt.errors;

public class ServiceUnavailableError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public ServiceUnavailableError() {
		super();
	}

	public ServiceUnavailableError(String message) {
		super(message);
	}

	public ServiceUnavailableError(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getErrorCode() {
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
