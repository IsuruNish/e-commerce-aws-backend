package com.ecommerce.auth_module.Dto;

import lombok.Data;

@Data
public class LoginUserDto {
    private String email;
    private String password;
}
