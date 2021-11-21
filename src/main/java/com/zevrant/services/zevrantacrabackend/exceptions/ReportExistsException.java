package com.zevrant.services.zevrantacrabackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ReportExistsException extends RuntimeException {

    public ReportExistsException(String message) {
        super(message);
    }
}
