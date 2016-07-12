package com.common.exception;

public class InvalidLoginException extends ServiceException {
    private static final long serialVersionUID = -5864690312831171611L;

    public InvalidLoginException(String username) {
        super("Invalid login: [" + username + "]");
    }
}
