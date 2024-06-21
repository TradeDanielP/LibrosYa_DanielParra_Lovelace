package com.librosYa.librosYa.api.dto.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationResponse {

    private long id;
    private Date reservationDate;
    private String status;
    private Long user;
    private Long book;
    
}
