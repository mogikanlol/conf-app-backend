package com.nikolaev.conf.request.resource;

import com.nikolaev.conf.request.dto.ConferenceRequestDto;
import com.nikolaev.conf.request.service.ConferenceRequestService;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFacade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/conf-requests")
public class ConferenceRequestResource {

    private final ConferenceRequestService conferenceRequestService;

    private final MapperFacade mapperFacade;

    @GetMapping
    public Page<ConferenceRequestDto> getAll(@PageableDefault Pageable pageable) {
        return conferenceRequestService.getAll(pageable)
                .map(r -> mapperFacade.map(r, ConferenceRequestDto.class));
    }
}
