package org.example;

public class NotDoubleDigitException extends Throwable {
    public NotDoubleDigitException() {
    }

    public NotDoubleDigitException(String message) {
        super(message);
    }

    public NotDoubleDigitException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotDoubleDigitException(Throwable cause) {
        super(cause);
    }

    public NotDoubleDigitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
