package com.ratemarkt.errors;

public class SystemError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public SystemError() {
		super();
	}

	public SystemError(String message) {
		super(message);
	}

	public SystemError(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getHttpStatusCode() {
		return 500;
	}

	@Override
	public int getErrorCode() {
		return 50000;
	}

	@Override
	public String getCaption() {
		return "System error";
	}

}