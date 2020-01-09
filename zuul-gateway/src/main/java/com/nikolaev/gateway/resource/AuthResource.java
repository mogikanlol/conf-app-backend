package com.nikolaev.gateway.resource;

import com.nikolaev.gateway.dto.SigninRequest;
import com.nikolaev.gateway.dto.SignupRequest;
import com.nikolaev.gateway.security.JwtTokenProvider;
import com.nikolaev.gateway.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthResource {

    private final AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody @Valid SigninRequest signinRequest) {
        return authService.authenticate(signinRequest);
    }

    @PostMapping("/register")
    public String register(@RequestBody @Valid SignupRequest signupRequest) {
        return authService.register(signupRequest);
    }

}
