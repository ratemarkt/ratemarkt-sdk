package com.ratemarkt.domain.errors;

public class NotAvailableError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public NotAvailableError() {
		super();
	}

	public NotAvailableError(Throwable cause) {
		super(null, cause);
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
	public int getApiErrorCode() {
		return 41000;
	}

	@Override
	public String getCaption() {
		return "Not available error";
	}
}
