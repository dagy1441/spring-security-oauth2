package com.spring.security.exceptions;

public class SendEmailException extends RuntimeException {
    public SendEmailException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SendEmailException(String exMessage) {
        super(exMessage);
    }
}
