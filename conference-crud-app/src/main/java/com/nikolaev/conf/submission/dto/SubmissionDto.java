package com.nikolaev.conf.submission.dto;

import com.nikolaev.conf.submission.domain.SubmissionStatus;
import lombok.Data;

@Data
public class SubmissionDto {

    private Long id;

    private String title;

    private boolean reviewable;

    private SubmissionStatus status;

}
