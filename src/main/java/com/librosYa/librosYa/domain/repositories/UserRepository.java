package com.librosYa.librosYa.domain.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librosYa.librosYa.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
