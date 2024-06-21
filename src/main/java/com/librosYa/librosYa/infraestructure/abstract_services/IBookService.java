package com.librosYa.librosYa.infraestructure.abstract_services;

import com.librosYa.librosYa.api.dto.request.create.BookRequest;
import com.librosYa.librosYa.api.dto.response.BookResponse;

public interface IBookService extends CRUD<BookRequest, BookResponse, Long>
{    
}
