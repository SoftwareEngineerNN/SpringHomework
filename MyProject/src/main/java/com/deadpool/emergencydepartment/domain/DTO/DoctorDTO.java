package com.deadpool.emergencydepartment.domain.DTO;

import com.deadpool.emergencydepartment.domain.enums.Sex;
import com.deadpool.emergencydepartment.domain.enums.Speciality;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class DoctorDTO {

    private String lastName;
    private String firstName;
    private Sex sex;
    private int experienceYears;
    private Speciality speciality;
    private int age;
    private Date birthDay;
}
