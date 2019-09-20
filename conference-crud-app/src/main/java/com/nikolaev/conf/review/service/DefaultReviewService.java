package com.nikolaev.conf.review.service;

import com.nikolaev.conf.DomainEntityNotFoundException;
import com.nikolaev.conf.review.domain.Review;
import com.nikolaev.conf.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DefaultReviewService implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Override
    public Review getById(Long id) {
        return reviewRepository.findById(id)
                .orElseThrow(() -> new DomainEntityNotFoundException(id));
    }
}
