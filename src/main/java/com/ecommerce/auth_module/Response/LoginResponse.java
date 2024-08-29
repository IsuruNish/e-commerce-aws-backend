package com.ecommerce.auth_module.Response;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private long expiresIn;

    private String error;

    public LoginResponse(String token, long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }

    public LoginResponse(String error) {
        this.error = error;
    }
}
