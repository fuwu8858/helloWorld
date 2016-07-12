package com.common.exception;

public abstract class ServiceException extends Exception {
    private static final long serialVersionUID = 410749780796720448L;

    public ServiceException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public ServiceException(Throwable cause) {
        super(cause);
    }

}
