package com.nikolaev.conference_request.status.repository;

import com.nikolaev.conference_request.status.domain.ConferenceRequestStatus;
import com.nikolaev.conference_request.status.domain.ConferenceRequestStatusName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRequestStatusRepository extends JpaRepository<ConferenceRequestStatus, Long> {
    ConferenceRequestStatus findByName(ConferenceRequestStatusName name);
}
