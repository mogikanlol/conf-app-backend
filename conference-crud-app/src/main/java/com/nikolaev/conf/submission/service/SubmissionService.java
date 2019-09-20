package com.nikolaev.conf.submission.service;

import com.nikolaev.conf.submission.domain.Submission;

import java.util.List;

public interface SubmissionService {

    List<Submission> getAll();

    Submission getById(Long id);
}
