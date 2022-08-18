package dev.yawkar.eternity.exception;

public class EternityApplicationException extends RuntimeException {

    public EternityApplicationException() {
        super();
    }

    public EternityApplicationException(String message) {
        super(message);
    }
}
