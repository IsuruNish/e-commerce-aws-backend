package com.ecommerce.auth_module.Dto;

import lombok.Data;

@Data
public class RegisterUserDto {
    private String email;
    private String password;
    private String name;
    private String role;
}
