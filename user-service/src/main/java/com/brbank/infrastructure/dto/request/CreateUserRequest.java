package com.brbank.infrastructure.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    private String name;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private String role;
}
