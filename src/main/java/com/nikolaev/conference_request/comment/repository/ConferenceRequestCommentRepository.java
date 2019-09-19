package com.nikolaev.conference_request.comment.repository;

import com.nikolaev.conference_request.comment.domain.ConferenceRequestComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRequestCommentRepository extends JpaRepository<ConferenceRequestComment, Long> {
}
