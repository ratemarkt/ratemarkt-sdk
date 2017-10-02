package com.ratemarkt.errors;

public class IllegalStateError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public IllegalStateError() {
		super();
	}

	public IllegalStateError(String message) {
		super(message);
	}

	public IllegalStateError(String message, Throwable cause) {
		super(message, cause);
	}

}
