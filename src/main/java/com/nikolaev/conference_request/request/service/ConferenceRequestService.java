package com.nikolaev.conference_request.request.service;

import com.nikolaev.conference_request.comment.dto.ConferenceRequestCommentDto;
import com.nikolaev.conference_request.request.dto.BriefConferenceRequestDto;
import com.nikolaev.conference_request.request.dto.ConferenceRequestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ConferenceRequestService {
    void createRequest(ConferenceRequestDto conferenceRequestDto);
    Page<BriefConferenceRequestDto> getAll(Integer statusNumber, Pageable pageable);
    void update(ConferenceRequestDto conferenceRequestDto);

    ConferenceRequestDto getRequest(Long requestId);

    ConferenceRequestDto createComment(Long requestId, ConferenceRequestCommentDto commentDto);

    Page<BriefConferenceRequestDto> findRequestsByUserId(Long id, Pageable pageable, Integer statusNumber);
}
