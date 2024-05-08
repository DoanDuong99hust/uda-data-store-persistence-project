package com.project.udadatastorepersistence.entity;

import com.project.udadatastorepersistence.pet.PetType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "pet")
@Data
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private PetType type;

    @Column
    private String name;

    @Column
    private LocalDate birthDate;

    @Column
    private String notes;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}