package com.authJWT.JWT_Auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/public")
public class HealthCheck {

    // http://localhost:8081/public/healthCheck
    @GetMapping("/healthCheck")
    public ResponseEntity<?> check(){
        log.info("hello this api called");
        return new ResponseEntity<>("OK" , HttpStatus.OK);
    }

}
