/**
 * 
 */
package com.kaplan.ktpa.cybersource.exception;



/**
 * Base Exception class . Application Exception would extend
 * from this class and all other exceptions should extend from Application Exception. 
 */
public class BaseApplicationException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// the error code of this exception.
    private String errorCode;	
	
	/**
	 * Constructor for BaseApplicationException 
	 * @param message The message of the exception
	 */
	public BaseApplicationException(String message) {
		super(message);
	}

	/**
	 * Constructor for BaseApplicationException.
	 * @param message The message of the exception.
	 * @param cause The cause of the exception.
	 */
	public BaseApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor for BaseApplicationException.
	 * @param cause The cause of the exception.
	 */
	public BaseApplicationException(Throwable cause) {
		super(cause);
	}

    /**
     * Returns the error code of this exception.
     * @return The error code of this exception.
     */
    public String getErrorCode() {
        return errorCode;
    }
    
    public void setErrorCode(String errorCode){
    	this.errorCode = errorCode;
    }

}
