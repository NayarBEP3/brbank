package com.brbank.infrastructure.controller;

import com.brbank.application.handler.UserHandler;
import com.brbank.infrastructure.dto.request.CreateUserRequest;
import com.brbank.infrastructure.dto.response.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserHandler userHandler;

    @PostMapping
    public ResponseEntity<UserResponse> registerUser(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok(userHandler.createUser(request));
    }
}
