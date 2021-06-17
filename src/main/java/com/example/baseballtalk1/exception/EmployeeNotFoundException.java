package com.example.baseballtalk1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class EmployeeNotFoundException extends ResponseStatusException {

    public EmployeeNotFoundException(String reason) {
        super(HttpStatus.NOT_FOUND, reason);
    }
}
