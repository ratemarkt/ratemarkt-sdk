package com.ratemarkt.errors;

public class CommunicationError extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CommunicationError(String message, Throwable cause) {
		super(message, cause);
	}
}
