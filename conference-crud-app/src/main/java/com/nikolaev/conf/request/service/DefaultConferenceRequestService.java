package com.nikolaev.conf.request.service;

import com.nikolaev.conf.request.domain.ConferenceRequest;
import com.nikolaev.conf.request.repository.ConferenceRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DefaultConferenceRequestService implements ConferenceRequestService {

    private final ConferenceRequestRepository requestRepository;

    @Override
    public Page<ConferenceRequest> getAll(Pageable pageable) {
        return requestRepository.findAll(pageable);
    }
}
