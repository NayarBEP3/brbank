package com.brbank.infrastructure.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private long id;
    private String name;
    private String lastName;
    private String email;
    private String userName;
}
