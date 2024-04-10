package com.example.response;

import com.example.model.USER_ROLE;
import com.example.model.User;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;
}
