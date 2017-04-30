package com.ratemarkt.errors;

public class AuthorizationError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public AuthorizationError() {
		super();
	}

	public AuthorizationError(String message, Throwable cause) {
		super(message, cause);
	}

	public AuthorizationError(String message) {
		super(message);
	}

	@Override
	public int getHttpStatusCode() {
		return 403;
	}

	@Override
	public int getApiErrorCode() {
		return 40300;
	}

	@Override
	public String getCaption() {
		return "Authorization error";
	}

}
