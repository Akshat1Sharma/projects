package com.stockPrice.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class UserLoginController {

    @PostMapping("/user")
    public Object createUser(){
        return null;
    }

}
