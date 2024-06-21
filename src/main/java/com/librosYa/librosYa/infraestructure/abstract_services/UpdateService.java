package com.librosYa.librosYa.infraestructure.abstract_services;

public interface UpdateService <Request, Response, Id>{
    Response update(Id id, Request request);
}
