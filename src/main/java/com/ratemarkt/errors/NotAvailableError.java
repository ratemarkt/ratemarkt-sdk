package com.ratemarkt.errors;

import java.util.Map;

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

	public NotAvailableError(String message, Throwable cause, Map<String, Object> debugData) {
		super(message, cause, debugData);
	}

}
