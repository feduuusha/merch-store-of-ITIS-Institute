package ru.itis.merch.store.exception;

public class RoleWithSpecifiedNameNotFoundException extends RuntimeException {
    public RoleWithSpecifiedNameNotFoundException(String message) {
        super(message);
    }
}
