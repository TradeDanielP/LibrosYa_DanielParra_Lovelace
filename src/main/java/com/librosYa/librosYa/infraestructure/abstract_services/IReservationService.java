package com.librosYa.librosYa.infraestructure.abstract_services;

import com.librosYa.librosYa.api.dto.request.create.ReservationRequest;
import com.librosYa.librosYa.api.dto.response.ReservationResponse;

public interface IReservationService extends CRUD<ReservationRequest,ReservationResponse,Long>{
    
}

