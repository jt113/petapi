package com.example.db.service;

import com.example.db.entity.Pet;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PetService {

    @Transactional
    public Pet findPetById(Long id) {
        return Pet.findById(id);
    }
}