package com.nikolaev.gateway.resource;

import com.nikolaev.gateway.dto.SigninRequest;
import com.nikolaev.gateway.dto.SignupRequest;
import com.nikolaev.gateway.security.JwtTokenProvider;
import com.nikolaev.gateway.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthResource {

    private final AuthService authService;

    private final JwtTokenProvider tokenProvider;

    //TODO: validations
    @PostMapping("/login")
    public String login(@RequestBody SigninRequest signinRequest) {
        return authService.authenticate(signinRequest);
    }

    //TODO: validations
    @PostMapping("/register")
    public String register(@RequestBody SignupRequest signupRequest) {
        return authService.register(signupRequest);
    }

}
