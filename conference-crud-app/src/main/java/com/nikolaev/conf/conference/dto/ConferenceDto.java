package com.nikolaev.conf.conference.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ConferenceDto {

    private Long id;

    private String title;

    private String acronym;

    private String webPage;

    private LocalDate expirationDate;

    private String city;

    private String country;

}
