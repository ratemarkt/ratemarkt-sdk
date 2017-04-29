package com.ratemarkt.domain.errors;

public abstract class ConnectorError extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ConnectorError() {
		super();
	}

	public ConnectorError(String message) {
		super(message);
	}

	public ConnectorError(String message, Throwable cause) {
		super(message, cause);
	}

	public abstract int getHttpStatusCode();

	public abstract int getApiErrorCode();

	public abstract String getCaption();

}
