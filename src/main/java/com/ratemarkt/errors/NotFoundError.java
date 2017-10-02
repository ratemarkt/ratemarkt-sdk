package com.ratemarkt.errors;

public class NotFoundError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public NotFoundError() {
		super();
	}

	public NotFoundError(String message) {
		super(message);
	}

	public NotFoundError(String message, Throwable cause) {
		super(message, cause);
	}

}
