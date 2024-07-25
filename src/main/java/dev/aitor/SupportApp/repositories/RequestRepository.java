package dev.aitor.SupportApp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import dev.aitor.SupportApp.models.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {

    
} 
    