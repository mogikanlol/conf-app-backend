package com.nikolaev.conf.submission.service;

import com.nikolaev.conf.DomainEntityNotFoundException;
import com.nikolaev.conf.submission.domain.Submission;
import com.nikolaev.conf.submission.repository.SubmissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultSubmissionService implements SubmissionService {

    private final SubmissionRepository submissionRepository;

    @Override
    public List<Submission> getAll() {
        return submissionRepository.findAll();
    }

    @Override
    public Submission getById(Long id) {
        return submissionRepository.findById(id)
                .orElseThrow(() -> new DomainEntityNotFoundException(id));
    }
}
