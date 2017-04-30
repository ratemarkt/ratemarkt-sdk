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

	@Override
	public int getHttpStatusCode() {
		return 500;
	}

	@Override
	public int getErrorCode() {
		return 51000;
	}

	@Override
	public String getCaption() {
		return "Payment Error";
	}

}
