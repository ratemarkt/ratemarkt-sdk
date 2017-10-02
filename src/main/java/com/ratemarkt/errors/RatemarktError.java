package com.ratemarkt.errors;

import com.ratemarkt.models.ErrorObj;

public class RatemarktError extends ConnectorError {

	private static final long serialVersionUID = 1L;

	private ErrorObj errorObj;

	public RatemarktError(int httpStatusCode, ErrorObj errorObj) {
		super(errorObj.getMessage());
		this.errorObj = errorObj;
	}

	public ErrorObj getErrorObj() {
		return errorObj;
	}

}
