package com.conversion.roman.numerals.exception;
/**
 * Custom Exception
 * @author Naveen
 *
 */
public class AppException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public AppException(String errorMessage, Throwable err) {
		super(errorMessage);
	}
	public AppException(String errorMessage) {
		super(errorMessage);
	}
}
