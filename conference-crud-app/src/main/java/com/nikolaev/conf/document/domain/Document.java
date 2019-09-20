package com.nikolaev.conf.document.domain;

import com.nikolaev.conf.review.domain.Review;
import com.nikolaev.conf.submission.domain.Submission;
import com.nikolaev.conf.submission.domain.SubmissionStatus;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Table
@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String filename;

    private byte[] data;

    @Enumerated(EnumType.STRING)
    private SubmissionStatus status;

    @ManyToOne
    @JoinColumn(name = "submission_id")
    private Submission submission;

    @OneToMany(mappedBy = "document")
    private List<Review> reviews;
}
