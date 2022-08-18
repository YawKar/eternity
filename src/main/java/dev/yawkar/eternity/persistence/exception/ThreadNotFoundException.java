package dev.yawkar.eternity.persistence.exception;

import dev.yawkar.eternity.exception.EternityApplicationException;

public class ThreadNotFoundException extends EternityApplicationException {

    public ThreadNotFoundException() {
        super();
    }

    public ThreadNotFoundException(String message) {
        super(message);
    }
}
