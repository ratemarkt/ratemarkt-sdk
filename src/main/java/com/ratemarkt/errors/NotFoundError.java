package com.ratemarkt.errors;

public class NotFoundError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public NotFoundError(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getHttpStatusCode() {
		return 404;
	}

	@Override
	public int getApiErrorCode() {
		return 40400;
	}

	@Override
	public String getCaption() {
		return "Not found error";
	}
}
