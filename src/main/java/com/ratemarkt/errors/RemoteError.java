package com.ratemarkt.errors;

public class RemoteError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	public RemoteError() {
		super();
	}

	public RemoteError(String message) {
		super(message);
	}

	public RemoteError(Throwable cause) {
		super(cause);
	}

	public RemoteError(String message, Throwable cause) {
		super(message, cause);
	}

}
