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

}
