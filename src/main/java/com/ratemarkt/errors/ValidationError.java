package com.ratemarkt.errors;

public class ValidationError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public ValidationError() {
		super();
	}

	public ValidationError(String message) {
		super(message);
	}

	public ValidationError(String message, Throwable cause) {
		super(message, cause);
	}

}
