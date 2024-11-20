package com.authJWT.JWT_Auth.controller;

import com.authJWT.JWT_Auth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public ResponseEntity<?> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getCurrentUser")
    public ResponseEntity<?> getCurrentUser(Principal principal){
        return userService.getCurrentUser(principal);
    }
}
