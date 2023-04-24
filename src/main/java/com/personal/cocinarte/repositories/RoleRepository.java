package com.personal.cocinarte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.cocinarte.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}