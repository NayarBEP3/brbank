package com.brbank.application.mapper;

import com.brbank.domain.model.UserModel;
import com.brbank.infrastructure.dto.request.CreateUserRequest;
import com.brbank.infrastructure.dto.response.UserResponse;
import com.brbank.infrastructure.persistance.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /* Objects. */
    UserModel fromRequestToModel(CreateUserRequest createUserRequest);
    UserResponse fromModelToResponse(UserModel userModel);
    UserEntity fromModelToEntity(UserModel userModel);
    UserModel fromEntityToModel(UserEntity userEntity);
}
