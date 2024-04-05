package com.example.gen20javaspringbootpossecurity.Controller;

import com.example.gen20javaspringbootpossecurity.Response.AuthenticationResponse;
import com.example.gen20javaspringbootpossecurity.Utility.RegisterRequest;
import com.example.gen20javaspringbootpossecurity.Service.UserService;
import com.example.gen20javaspringbootpossecurity.Utility.AuthenticationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping ("/register")
    public ResponseEntity <AuthenticationResponse> register (@RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.register(request));
    }
    @PostMapping("/login")
    public ResponseEntity <AuthenticationResponse> login (@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(userService.authenticate(request));

    }

}
