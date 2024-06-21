package com.librosYa.librosYa.infraestructure.abstract_services;

import com.librosYa.librosYa.api.dto.request.create.LoanRequest;
import com.librosYa.librosYa.api.dto.response.LoanResponse;

public interface ILoanService extends CRUD<LoanRequest,LoanResponse, Long> {
    
}
