package com.librosYa.librosYa.api.dto.request.create;


import java.util.Date;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    
    @NotBlank(message = "Reservation date must not be null")
    @Future(message = "Reservation Date must be in a future date")
    private Date reservationDate;

    @NotNull(message = "User id is required")
    @Min(value = 1, message = "User id must be greater than 0")
    private Long userId;
    
    @NotNull(message = "Book id is required")
    @Min(value = 1, message = "book id must be greater than 0")
    private Long bookId;

}
