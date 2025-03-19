package com.brbank.domain.service;

import com.brbank.domain.model.UserModel;
import com.brbank.domain.port.UserUseCases;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UserUseCases userUseCases;

    public UserModel createUser(final UserModel userModel) {
        return userUseCases.createUser(userModel);
    }

    public List<UserModel> getAllUsers() {
        return userUseCases.getAllUsers();
    }

    public UserModel updateUser(final UserModel userModel) {
        return userUseCases.updateUser(userModel);
    }

    public void deleteUser(final String userName) {
        userUseCases.deleteUser(userName);
    }
}
