package com.ratemarkt.errors;

public class IllegalStateError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public IllegalStateError(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getHttpStatusCode() {
		return 409;
	}

	@Override
	public int getApiErrorCode() {
		return 40900;
	}

	@Override
	public String getCaption() {
		return "Illegal state error";
	}
}
