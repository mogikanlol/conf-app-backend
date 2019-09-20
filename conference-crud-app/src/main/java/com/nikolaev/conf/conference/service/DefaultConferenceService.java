package com.nikolaev.conf.conference.service;

import com.nikolaev.conf.DomainEntityNotFoundException;
import com.nikolaev.conf.conference.domain.Conference;
import com.nikolaev.conf.conference.repository.ConferenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DefaultConferenceService implements ConferenceService {

    private final ConferenceRepository conferenceRepository;

    @Override
    public Conference getById(Long id) {
        return conferenceRepository.findById(id)
                .orElseThrow(() -> new DomainEntityNotFoundException(id));
    }

    @Override
    public Page<Conference> getAll(Pageable pageable) {
        return conferenceRepository.findAll(pageable);
    }
}
