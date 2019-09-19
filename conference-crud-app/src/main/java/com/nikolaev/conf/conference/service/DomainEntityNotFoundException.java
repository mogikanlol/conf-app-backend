package com.nikolaev.conf.conference.service;

public class DomainEntityNotFoundException extends RuntimeException {

    public DomainEntityNotFoundException(Long id) {
        super(String.format("Entity with id %s was not found", id));
    }

    public DomainEntityNotFoundException(String message) {
        super(message);
    }
}
