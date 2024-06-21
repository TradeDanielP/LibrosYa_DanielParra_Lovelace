package com.librosYa.librosYa.api.dto.request.update;

import java.time.LocalDate;

import jakarta.validation.constraints.Future;
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
public class ReservationUpdateRequest {

    @NotBlank(message = "Reservation date must not be null")
    @Future(message = "Reservation Date must be in a future date")
    private LocalDate reservationDate;

    @NotBlank(message = "Status must not be null")
    @Size(max = 20, message = "Status cannot be longer than 20 characteres")
    private String status;


    
}
