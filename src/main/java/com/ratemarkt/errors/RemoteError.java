package com.ratemarkt.errors;

import com.ratemarkt.models.ErrorObj;

public class RemoteError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	private int httpStatusCode;
	private ErrorObj errorObj;

	public RemoteError(int httpStatusCode, ErrorObj errorObj) {
		super(errorObj.getMessage());
		this.errorObj = errorObj;
		this.httpStatusCode = httpStatusCode;
	}

	@Override
	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	@Override
	public int getErrorCode() {
		return errorObj.getErrorCode();
	}

	@Override
	public String getCaption() {
		return errorObj.getMessage();
	}

}