package com.nikolaev.review.repository;

import com.nikolaev.review.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Override
    Review getOne(Long id);
}
