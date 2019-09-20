package com.nikolaev.conf.review.resource;

import com.nikolaev.conf.review.dto.ReviewDto;
import com.nikolaev.conf.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewResource {

    private final ReviewService reviewService;

    private final MapperFacade mapperFacade;

    @GetMapping("{id}")
    public ReviewDto getById(@PathVariable("id") Long id) {
        return mapperFacade.map(reviewService.getById(id), ReviewDto.class);
    }

}
