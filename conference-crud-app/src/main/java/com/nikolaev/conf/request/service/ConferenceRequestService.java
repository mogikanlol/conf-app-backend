package com.nikolaev.conf.request.service;

import com.nikolaev.conf.request.domain.ConferenceRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ConferenceRequestService {

    Page<ConferenceRequest> getAll(Pageable pageable);
}
