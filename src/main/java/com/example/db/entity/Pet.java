package com.example.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Table;

@Entity
@Table(name = "pets", schema = "petapi")
public class Pet extends PanacheEntityBase {
    @Id
    public Long id;
    public String name;
    public String breed;

    @Column(name = "allergy_id_list")
    public String allergyIdList;

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", allergyIdList='" + allergyIdList + '\'' +
                '}';
    }
}