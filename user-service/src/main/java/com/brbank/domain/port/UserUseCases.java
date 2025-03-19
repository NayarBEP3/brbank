package com.brbank.domain.port;

import com.brbank.domain.model.UserModel;

import java.util.List;

public interface UserUseCases {
    UserModel createUser(final UserModel userModel);
    UserModel getUser(final String userName);
    List<UserModel> getAllUsers();
    UserModel updateUser(final UserModel userModel);
    void deleteUser(final String userName);
}
