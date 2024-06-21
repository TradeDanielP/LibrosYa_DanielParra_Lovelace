package com.librosYa.librosYa.api.dto.request.create;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanRequest {

    @NotNull
    private LocalDate loanDate;
  
    @NotNull
    private LocalDate returnDate;

    @NotBlank
    @Size(max = 20)
    private String status;

    @NotNull
    private Long userId;

    @NotNull
    private Long bookId;
}
