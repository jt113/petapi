package com.example.db.service;

import com.example.db.entity.Allergen;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AllergenService {

    @Transactional
    public Allergen findByAllergyId(Long allergyId) {
        return Allergen.findById(allergyId);
    }

}
