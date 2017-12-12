package com.ratemarkt.errors;

import java.util.Map;

public class BookingError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public BookingError(String message, Throwable cause, Map<String, Object> debugData) {
		super(message, cause, debugData);
	}
}
