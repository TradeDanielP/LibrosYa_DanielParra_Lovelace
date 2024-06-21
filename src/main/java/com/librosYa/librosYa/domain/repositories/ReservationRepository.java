package com.librosYa.librosYa.domain.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.librosYa.librosYa.domain.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> 
{
    Page<Reservation> findByUserId(Long id, Pageable pageable); 
    
    Page<Reservation> findByBookId(Long id, Pageable pageable); 

}