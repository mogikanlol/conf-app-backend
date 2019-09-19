package com.nikolaev.security.signup;

import com.nikolaev.security.service.JwtAuthenticationResponse;

public interface SignupService {
    JwtAuthenticationResponse signup(SignupRequest signupRequest) throws SignupException;
}
