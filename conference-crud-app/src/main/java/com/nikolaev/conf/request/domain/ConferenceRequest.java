package com.nikolaev.conf.request.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table
public class ConferenceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String acronym;

    private String webPage;

    private LocalDate expirationDate;

    private String city;

    private String country;

    @OneToMany(mappedBy = "request")
    private List<ConferenceRequestComment> comments;

    @Enumerated(EnumType.STRING)
    private ConferenceRequestStatus status;

}
