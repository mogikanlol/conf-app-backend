package com.nikolaev.conf.request.repository;

import com.nikolaev.conf.request.domain.ConferenceRequestComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRequestCommentRepository extends JpaRepository<ConferenceRequestComment, Long> {
}
