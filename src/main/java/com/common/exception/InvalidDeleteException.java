package com.common.exception;

public class InvalidDeleteException extends ServiceException {

    private static final long serialVersionUID = 1L;

	public InvalidDeleteException(String message) {
        super(message);
    }
}
