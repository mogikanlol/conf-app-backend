package com.nikolaev.gateway.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String password;
}