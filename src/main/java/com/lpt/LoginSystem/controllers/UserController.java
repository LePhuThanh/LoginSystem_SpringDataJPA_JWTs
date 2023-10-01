package com.lpt.LoginSystem.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
@CrossOrigin("*") // Permit all domain access
public class UserController {
    @GetMapping(value = "/")
    public String helloUserController(){
        return "User access level";
    }
}
