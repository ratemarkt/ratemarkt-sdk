package com.ratemarkt.errors;

public class ValidationError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public ValidationError(String message) {
		super(message);
	}

	public ValidationError(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getHttpStatusCode() {
		return 400;
	}

	@Override
	public int getApiErrorCode() {
		return 40000;
	}

	@Override
	public String getCaption() {
		return "Validation error";
	}

}
