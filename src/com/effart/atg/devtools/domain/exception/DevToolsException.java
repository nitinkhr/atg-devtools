/**
 * 
 */
package com.effart.atg.devtools.domain.exception;

/**
 * @author virt
 *
 */
public class DevToolsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7203957352111326485L;

	/**
	 * 
	 */
	public DevToolsException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public DevToolsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public DevToolsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DevToolsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
