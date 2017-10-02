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
}
