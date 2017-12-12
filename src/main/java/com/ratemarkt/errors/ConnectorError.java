package com.ratemarkt.errors;

import java.util.Map;

public class ConnectorError extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> debugData;

	public ConnectorError() {
		super();
	}

	public ConnectorError(String message) {
		super(message);
	}

	public ConnectorError(String message, Throwable cause) {
		super(message, cause);
	}

	public ConnectorError(String message, Throwable cause, Map<String, Object> debugData) {
		super(message, cause);
		this.debugData = debugData;
	}

	public ConnectorError(Throwable cause) {
		super(cause);
	}

	public Map<String, Object> getDebugData() {
		return debugData;
	}

	public void setDebugData(Map<String, Object> debugData) {
		this.debugData = debugData;
	}

}
