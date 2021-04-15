package com.deadpool.emergencydepartment.domain.DTO;

import com.deadpool.emergencydepartment.domain.enums.Speciality;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DoctorDTO {

    private String lastName;
    private String firstName;
    private int experienceYears;
    private Speciality speciality;
}
