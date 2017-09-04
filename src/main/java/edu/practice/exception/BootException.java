package edu.practice.exception;

public class BootException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -219062373812507928L;

	String message;
	String code;

	public BootException(String code, String message){
        this.code = code;
		this.message = message;
	}

}
