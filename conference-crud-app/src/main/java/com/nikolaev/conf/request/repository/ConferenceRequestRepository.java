package com.nikolaev.conf.request.repository;

import com.nikolaev.conf.request.domain.ConferenceRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRequestRepository extends JpaRepository<ConferenceRequest, Long> {

    @Override
    Page<ConferenceRequest> findAll(Pageable pageable);
}
