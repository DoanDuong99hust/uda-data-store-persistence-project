package com.project.udadatastorepersistence.entity;

import com.project.udadatastorepersistence.user.EmployeeSkill;
import jakarta.persistence.*;
import lombok.Data;

import java.time.DayOfWeek;
import java.util.Set;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Set<EmployeeSkill> skills;

    @Column
    private Set<DayOfWeek> daysAvailable;
}
