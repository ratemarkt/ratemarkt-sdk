package com.ratemarkt.errors;

public class RateLimitExceededError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public RateLimitExceededError() {
		super();
	}

	public RateLimitExceededError(String message) {
		super(message);
	}

	public RateLimitExceededError(String message, Throwable cause) {
		super(message, cause);
	}

}
