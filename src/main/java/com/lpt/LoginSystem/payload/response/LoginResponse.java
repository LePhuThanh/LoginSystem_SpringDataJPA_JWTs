package com.lpt.LoginSystem.payload.response;

import com.lpt.LoginSystem.entities.ApplicationUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//DTO - Data Transfer Object
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
    private ApplicationUser user;
    private String jwt;
}
