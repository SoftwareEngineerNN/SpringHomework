package com.deadpool.emergencydepartment.domain.entity;

import com.deadpool.emergencydepartment.enums.Sex;
import com.deadpool.emergencydepartment.enums.Speciality;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    private UUID id = UUID.randomUUID();
    private String lastName;
    private String firstName;
    private int age;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private int experienceYears;
    @Enumerated(EnumType.STRING)
    private Speciality speciality;





}
