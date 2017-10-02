package com.ratemarkt.errors;

public class PaymentError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public PaymentError() {
		super();
	}

	public PaymentError(String message) {
		super(message);
	}

	public PaymentError(String message, Throwable cause) {
		super(message, cause);
	}

}
