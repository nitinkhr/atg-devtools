package com.effart.atg.devtools.domain;

public enum ResponseStatus {
	failure(-1),
	loginIncorrect(-1),
	loginRequired(-1),
	loginSuccess(0),
	maxLoginAttemptsExceeded(-1),
	serverTimeout(-1),
	success(0),
	transportError(-1),
	validationError(-4);
	
	private int code;
	
	private ResponseStatus(int code) {
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
}
