package com.example.db.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "allergens", schema = "petapi")
public class Allergen extends PanacheEntityBase {

    @Id
    @Column(name = "allergy_id")
    public Long allergyId;

    public String substance;

    public Long severity;

}
