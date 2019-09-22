package com.nikolaev.conf.request.dto;

import com.nikolaev.conf.request.domain.ConferenceRequestStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ConferenceRequestDto {

    private Long id;

    private String title;

    private String acronym;

    private String webPage;

    private String city;

    private String country;

    //    private List<ConferenceRequestCommentDto> comments;
    private ConferenceRequestStatus status;

    private LocalDate expirationDate;
}
