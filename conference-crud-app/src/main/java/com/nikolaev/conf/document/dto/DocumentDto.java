package com.nikolaev.conf.document.dto;

import com.nikolaev.conf.submission.domain.SubmissionStatus;
import lombok.Data;

@Data
public class DocumentDto {

    private Long id;

    private String filename;

    private SubmissionStatus status;
}
