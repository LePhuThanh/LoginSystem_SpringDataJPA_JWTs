package com.lpt.LoginSystem.payload.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegisterUserRequest {
    private String username;
    private String password;
}
