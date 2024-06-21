package com.librosYa.librosYa.api.dto.request.create;

import com.librosYa.librosYa.api.dto.request.update.UserUpdateRequest;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest extends UserUpdateRequest {
    @NotBlank(message = "Rol must not be null")
    private String role;
}