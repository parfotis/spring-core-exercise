package com.learning.ote.spring.mvc.exception;

public class AuthorNotFoundException extends RuntimeException {

    private String exceptionMessage;

    public AuthorNotFoundException(String message) {
        super(message);
    }

    public AuthorNotFoundException(String message, Throwable cause, String exceptionMessage) {
        super(message, cause);
        this.exceptionMessage = exceptionMessage;
    }

    public AuthorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
