package com.librosYa.librosYa.domain.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.librosYa.librosYa.domain.entities.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> 
{
    Page<Loan> findByUserId(Long id, Pageable pageable);
}

