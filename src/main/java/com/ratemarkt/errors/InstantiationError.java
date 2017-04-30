package com.ratemarkt.errors;

public class InstantiationError extends SystemError {

	private static final long serialVersionUID = 1L;

	public InstantiationError(String message) {
		super(message);
	}

	public InstantiationError(String message, Throwable cause) {
		super(message, cause);
	}

}
