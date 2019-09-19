package com.nikolaev.conf.conference.resource;

import com.nikolaev.conf.conference.domain.Conference;
import com.nikolaev.conf.conference.service.ConferenceService;
import com.nikolaev.conf.conference.service.DomainEntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/conferences")
public class ConferenceResource {

    private final ConferenceService conferenceService;

    @GetMapping
    public Page<Conference> getAll(@PageableDefault Pageable pageable) {
        return conferenceService.getAll(pageable);
    }

    @GetMapping("{id}")
    public Conference getById(@PathVariable("id") Long id) {
        return conferenceService.getById(id);
    }

    @ExceptionHandler
    public ResponseEntity handleNotFound(DomainEntityNotFoundException ex) {
        return new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
