package com.nikolaev.conf.request.dto;

import com.nikolaev.conf.request.domain.ConferenceRequestStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ConferenceRequestCommentDto {

    private Long id;

    private LocalDate date;

    private String content;

    private ConferenceRequestStatus status;
}
