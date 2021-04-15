package com.deadpool.emergencydepartment.domain.entity;

import com.deadpool.emergencydepartment.domain.enums.Role;
import com.deadpool.emergencydepartment.domain.enums.Sex;
import com.deadpool.emergencydepartment.domain.enums.Speciality;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "doctors")
@NoArgsConstructor
@Getter
@Setter
public class Doctor extends Base {

    @Enumerated(EnumType.STRING)
    private Role role;
    private String lastName;
    private String firstName;
    private int age;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private int experienceYears;
    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    public Doctor(String lastName, String firstName, int age, Sex sex, int experienceYears, Speciality speciality) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.sex = sex;
        this.experienceYears = experienceYears;
        this.speciality = speciality;
    }


}
