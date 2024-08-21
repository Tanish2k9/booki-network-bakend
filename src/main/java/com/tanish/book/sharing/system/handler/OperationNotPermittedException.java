package com.tanish.book.sharing.system.handler;

public class OperationNotPermittedException extends RuntimeException{

    public OperationNotPermittedException() {
    }

    public OperationNotPermittedException(String message) {
        super(message);
    }
}
