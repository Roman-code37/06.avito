package ru.itpark.exception;

public class DataException extends RuntimeException {
    public DataException(){
    }

    protected DataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataException(String message) {
        super(message);
    }
}
