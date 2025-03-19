package com.brbank.application.handler;

import com.brbank.application.mapper.UserMapper;
import com.brbank.domain.service.UserService;
import com.brbank.infrastructure.dto.request.CreateUserRequest;
import com.brbank.infrastructure.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserHandler {
    private final UserService userService;

    public UserResponse createUser(final CreateUserRequest createUserRequest) {
        final var userModel = UserMapper.INSTANCE.fromRequestToModel(createUserRequest);
        final var response = userService.createUser(userModel);
        return UserMapper.INSTANCE.fromModelToResponse(response);
    }
}
