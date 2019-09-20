package com.nikolaev.conf.configuration;

import com.nikolaev.conf.DomainEntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity handleNotFound(DomainEntityNotFoundException ex) {
        log.error(ex.getMessage(), ex);

        return new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
