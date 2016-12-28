package com.team.foodybox.exception;

import org.springframework.http.HttpStatus;

/**
 * 
 * @author Shankara
 *
 */
public class MightyAppException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HttpStatus httpStatus;
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public MightyAppException(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	public MightyAppException(String errorMessage) {
		super(errorMessage);
	}
	
	public MightyAppException(String errorMessage, Throwable throwable) {
		super(errorMessage, throwable);
	}
	
	public MightyAppException(Throwable throwable) {
		super(throwable);
	}
	
	public MightyAppException(String errorMessage, HttpStatus httpStatus, Throwable throwable) {
		super(errorMessage, throwable);
		this.httpStatus = httpStatus;
	}
	
	public MightyAppException(String errorMessage, HttpStatus httpStatus) {
		super(errorMessage);
		this.httpStatus = httpStatus;
	}
}
