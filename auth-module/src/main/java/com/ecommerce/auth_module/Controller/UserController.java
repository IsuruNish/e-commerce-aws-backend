package com.ecommerce.auth_module.Controller;

import com.ecommerce.auth_module.Dto.LoginUserDto;
import com.ecommerce.auth_module.Dto.RegisterUserDto;
import com.ecommerce.auth_module.Model.User;
import com.ecommerce.auth_module.Response.LoginResponse;
import com.ecommerce.auth_module.Service.AuthService;
import com.ecommerce.auth_module.Service.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    private final JwtService jwtService;
    private final AuthService authService;

    public UserController(JwtService jwtService, AuthService authService) {
        this.jwtService = jwtService;
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterUserDto registerUserDto) {

        try{
            User registereduser = authService.signup(registerUserDto);
            System.out.println(registereduser);
            return ResponseEntity.ok(registereduser.toString());
        }
        catch(Error e){
            return ResponseEntity.badRequest().body("Could not signup: " + e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginUserDto loginUserDto) {
        try{
            User authUser = authService.authenticate(loginUserDto);
            String jwtToken = jwtService.generateToken(authUser);
            LoginResponse loginResponse = new LoginResponse(jwtToken, jwtService.getExpirationTime());
            return ResponseEntity.ok(loginResponse);
        }
        catch(Error e){
            LoginResponse loginResponse = new LoginResponse("Could not signup: " + e.getMessage());
            return ResponseEntity.badRequest().body(loginResponse);
        }
    }
}
