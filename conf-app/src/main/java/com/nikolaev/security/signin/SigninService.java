package com.nikolaev.security.signin;

import com.nikolaev.security.service.JwtAuthenticationRequest;
import com.nikolaev.security.service.JwtAuthenticationResponse;

public interface SigninService {
    JwtAuthenticationResponse signin(JwtAuthenticationRequest authenticationRequest);
}
