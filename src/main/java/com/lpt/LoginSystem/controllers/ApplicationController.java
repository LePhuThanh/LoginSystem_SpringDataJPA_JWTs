package com.lpt.LoginSystem.controllers;

import com.lpt.LoginSystem.entities.ApplicationUser;
import com.lpt.LoginSystem.request.RegisterUserRequest;
import com.lpt.LoginSystem.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
@CrossOrigin("*")
public class ApplicationController {
    @Autowired
    private AuthenticationService authenticationService;
    @PostMapping(value = "/register")
    public ApplicationUser registerUser(@RequestBody RegisterUserRequest request){
        return authenticationService.registerUser(request.getUsername(),request.getPassword());
    }
}
