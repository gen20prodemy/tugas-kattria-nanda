package com.example.gen20javaspringbootposredis.Service;

import com.example.gen20javaspringbootposredis.Entity.UserEntity;
import com.example.gen20javaspringbootposredis.Entity.UserRole;
import com.example.gen20javaspringbootposredis.Repository.UserRepo;
import com.example.gen20javaspringbootposredis.Utility.AuthenticationRequest;
import com.example.gen20javaspringbootposredis.Response.AuthenticationResponse;
import com.example.gen20javaspringbootposredis.Utility.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private  final UserRepo userRepo;
    private final AuthenticationManager authenticationManager;
    private  final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    public AuthenticationResponse register (RegisterRequest request){
        var user = UserEntity.builder()
                .fullName(request.getFullName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .userRole(UserRole.USER)
                .build();
        userRepo.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = userRepo.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }


}
