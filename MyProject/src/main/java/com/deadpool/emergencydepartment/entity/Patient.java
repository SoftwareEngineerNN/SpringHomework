package com.deadpool.emergencydepartment.entity;

import com.deadpool.emergencydepartment.enums.Sex;

public class Patient {
    private int id;
    private String lastName;
    private String firstName;
    private int age;
    private Sex sex;
    private long medicalInsuranceNumber;
    private String email;
    private boolean isExamined;
}
