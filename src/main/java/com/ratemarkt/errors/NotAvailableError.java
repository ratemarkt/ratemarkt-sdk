package com.ratemarkt.errors;

public class NotAvailableError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public NotAvailableError() {
		super();
	}

	public NotAvailableError(Throwable cause) {
		super(cause);
	}

	public NotAvailableError(String message) {
		super(message);
	}

	public NotAvailableError(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public int getHttpStatusCode() {
		return 410;
	}

	@Override
	public int getErrorCode() {
		return 41000;
	}

	@Override
	public String getCaption() {
		return "Not available error";
	}
}
