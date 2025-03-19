package com.brbank.infrastructure.adapter;

import com.brbank.application.mapper.UserMapper;
import com.brbank.domain.model.UserModel;
import com.brbank.domain.port.UserUseCases;
import com.brbank.infrastructure.persistance.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserAdapter implements UserUseCases {

    private final UserJpaRepository userJpaRepository;

    @Override
    public UserModel createUser(final UserModel userModel) {
        var userEntity = UserMapper.INSTANCE.fromModelToEntity(userModel);
        userEntity = this.userJpaRepository.save(userEntity);
        return UserMapper.INSTANCE.fromEntityToModel(userEntity);
    }

    @Override
    public UserModel getUser(final String userName) {
        return null;
    }

    @Override
    public List<UserModel> getAllUsers() {
        return List.of();
    }

    @Override
    public UserModel updateUser(final UserModel userModel) {
        return null;
    }

    @Override
    public void deleteUser(final String userName) {

    }
}
