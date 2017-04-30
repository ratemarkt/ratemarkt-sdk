package com.ratemarkt.errors;

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

	public ConnectorError(Throwable cause) {
		super(cause);
	}

	public abstract int getHttpStatusCode();

	public abstract int getErrorCode();

	public abstract String getCaption();

}
