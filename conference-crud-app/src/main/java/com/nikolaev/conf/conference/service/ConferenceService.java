package com.nikolaev.conf.conference.service;

import com.nikolaev.conf.conference.domain.Conference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ConferenceService {

    Conference getById(Long id);

    Page<Conference> getAll(Pageable pageable);

}
