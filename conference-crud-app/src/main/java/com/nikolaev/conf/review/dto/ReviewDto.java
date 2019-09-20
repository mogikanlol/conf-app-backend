package com.nikolaev.conf.review.dto;

import com.nikolaev.conf.review.domain.ReviewStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReviewDto {

    private Long id;

    private String title;

    private boolean submitted;

    private String evaluation;

    private LocalDateTime date;

    private ReviewStatus status;
}
