package com.ratemarkt.errors;

public class AuthenticationError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public AuthenticationError() {
		super();
	}

	public AuthenticationError(String message) {
		super(message);
	}

	public AuthenticationError(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getHttpStatusCode() {
		return 401;
	}

	@Override
	public int getErrorCode() {
		return 40100;
	}

	@Override
	public String getCaption() {
		return "Authentication error";
	}
}
