package com.ratemarkt.errors;

public class AuthorizationError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public AuthorizationError() {
		super();
	}

	public AuthorizationError(String message) {
		super(message);
	}

	public AuthorizationError(String message, Throwable cause) {
		super(message, cause);
	}

}
