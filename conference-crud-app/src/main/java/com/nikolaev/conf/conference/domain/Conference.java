package com.nikolaev.conf.conference.domain;

import com.nikolaev.conf.submission.domain.Submission;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
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
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String acronym;

    private String webPage;

    private LocalDate expirationDate;

    private String city;

    private String country;

    @OneToMany(mappedBy = "conference")
    private List<Submission> submissions;
}
