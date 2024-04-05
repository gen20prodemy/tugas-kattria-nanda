package com.example.gen20javaspringbootposrestemplate.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder //builder class secara otomatis
@Getter
@Setter
@AllArgsConstructor
public class AuthenticationResponse {
    private  String token;
}
