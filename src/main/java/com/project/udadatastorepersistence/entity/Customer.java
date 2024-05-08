package com.project.udadatastorepersistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    @Column
    private String notes;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Pet> petIds;
}
