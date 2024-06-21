package com.librosYa.librosYa.infraestructure.mappers;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.librosYa.librosYa.api.dto.request.create.UserRequest;
import com.librosYa.librosYa.api.dto.response.UserResponse;
import com.librosYa.librosYa.domain.entities.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper 
{
     @Mapping(target = "id", ignore = true)
    User toUser(UserRequest userRequest);

    UserResponse toUserResponse(User user);

    List<UserRequest> requestToList(List<User> userList);

    List<User> toEntityList(List<UserResponse> responseUser);
}