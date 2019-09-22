package com.nikolaev.conf.request.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table
public class ConferenceRequestComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private String content;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private ConferenceRequest request;

    @Enumerated(EnumType.STRING)
    private ConferenceRequestStatus status;
}
