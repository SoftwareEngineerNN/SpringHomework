package com.deadpool.emergencydepartment.domain.entity;

import com.deadpool.emergencydepartment.enums.Sex;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Patient {
    private int id;
    private String lastName;
    private String firstName;
    private int age;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private long medicalInsuranceNumber;
    private String email;
    private boolean isExamined;
}
