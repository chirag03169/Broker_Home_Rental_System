package com.example.Borker_Login_Auth.controller;

import com.example.Borker_Login_Auth.entity.AuthRequest;
import com.example.Borker_Login_Auth.entity.UserInfo;
import com.example.Borker_Login_Auth.service.JwtService;
import com.example.Borker_Login_Auth.service.UserInfoService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    private UserInfoService service;
    private JwtService jwtService;
    private AuthenticationManager authenticationManager;

    public UserController(UserInfoService service, JwtService jwtService, AuthenticationManager authenticationManager) {
        this.service = service;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }

    public UserInfoService getService() {
        return service;
    }
    public void setService(UserInfoService service) {
        this.service = service;
    }

    public JwtService getJwtService() {
        return jwtService;
    }
    public void setJwtService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/addNewUser")
    public String addNewUser(@RequestBody UserInfo userInfo) {
        return service.addUser(userInfo);
    }

    @PostMapping("/generateToken")
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
        );
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("Invalid user request!");
        }
    }

    @GetMapping("/verifyToken")
    public String verifyToken() {
        return "Token is valid!";
    }

}
