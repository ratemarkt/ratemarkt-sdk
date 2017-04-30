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

	@Override
	public int getHttpStatusCode() {
		return 403;
	}

	@Override
	public int getErrorCode() {
		return 40300;
	}

	@Override
	public String getCaption() {
		return "Authorization error";
	}

}
