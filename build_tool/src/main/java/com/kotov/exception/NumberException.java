package com.kotov.exception;

public class NumberException extends Exception {
    public NumberException() {
        super();
    }

    public NumberException(String message) {
        super(message);
    }

    public NumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberException(Throwable cause) {
        super(cause);
    }
}
