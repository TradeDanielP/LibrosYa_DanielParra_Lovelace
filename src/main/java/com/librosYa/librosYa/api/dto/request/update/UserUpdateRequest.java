package com.librosYa.librosYa.api.dto.request.update;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateRequest {
    @NotBlank(message = "User name must not be null")
    @Size(
            max = 50,
            message = "User name cannot be longer than 50 characters."
    )
    private String userName;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters long")
    private String password;

    @Email(message = "The email must be a valid email [example@example.com]")
    private String email;

    @NotBlank(message = "Full name must not be null")
    @Size(
            max = 100,
            message = "Full name cannot be longer than 100 characters."
    )
    private String fullName;
}
