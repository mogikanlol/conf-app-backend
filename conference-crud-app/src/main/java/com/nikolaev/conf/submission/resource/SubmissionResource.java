package com.nikolaev.conf.submission.resource;

import com.nikolaev.conf.submission.domain.Submission;
import com.nikolaev.conf.submission.dto.SubmissionDto;
import com.nikolaev.conf.submission.service.SubmissionService;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/submissions")
public class SubmissionResource {

    private final SubmissionService submissionService;

    private final MapperFacade mapperFacade;

    @GetMapping
    public List<SubmissionDto> getAll() {
        return submissionService.getAll()
                .stream()
                .map(s -> mapperFacade.map(s, SubmissionDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public SubmissionDto getById(@PathVariable("id") Long id) {
        return mapperFacade.map(submissionService.getById(id), SubmissionDto.class);
    }

}
