package com.nikolaev.conf.conference.resource;

import com.nikolaev.conf.conference.domain.Conference;
import com.nikolaev.conf.conference.dto.ConferenceDto;
import com.nikolaev.conf.conference.service.ConferenceService;
import com.nikolaev.conf.DomainEntityNotFoundException;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFacade;
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

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/conferences")
public class ConferenceResource {

    private final ConferenceService conferenceService;

    private final MapperFacade mapperFacade;

    @GetMapping
    public Page<ConferenceDto> getAll(@PageableDefault Pageable pageable) {
        return conferenceService
                .getAll(pageable)
                .map(c -> mapperFacade.map(c, ConferenceDto.class));
    }

    @GetMapping("{id}")
    public ConferenceDto getById(@PathVariable("id") Long id) {
        return mapperFacade.map(conferenceService.getById(id), ConferenceDto.class);
    }
}
