package dev.yawkar.eternity.persistence.exception;

import dev.yawkar.eternity.exception.EternityApplicationException;

public class ThreadNotFoundException extends EternityApplicationException {

    public ThreadNotFoundException(long threadId) {
        super("Thread with threadId=%s not found".formatted(threadId));
    }
}
