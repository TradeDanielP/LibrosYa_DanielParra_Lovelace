package com.librosYa.librosYa.infraestructure.abstract_services;

import com.librosYa.librosYa.api.dto.request.create.UserRequest;
import com.librosYa.librosYa.api.dto.response.UserResponse;

public interface IUserService extends CRUD<UserRequest, UserResponse, Long>
{
}
