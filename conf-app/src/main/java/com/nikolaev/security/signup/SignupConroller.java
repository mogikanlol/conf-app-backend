package com.nikolaev.security.signup;

import com.nikolaev.security.service.JwtAuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/auth/signup")
public class SignupConroller {


    @Autowired
    SignupService signupService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody SignupRequest signupRequest) throws SignupException {
        JwtAuthenticationResponse response = signupService.signup(signupRequest);

        return ResponseEntity.ok(response);

    }
}
