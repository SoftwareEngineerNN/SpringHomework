package com.deadpool.emergencydepartment.domain.DTO;


import com.deadpool.emergencydepartment.domain.enums.Sex;

import lombok.*;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;


import javax.validation.constraints.Min;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.HashMap;

import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PatientDTO {

    @Size(min = 2, message = "Last name must be at least 2 symbols")
    @NotBlank
    private String lastName;
    @Size(min = 2, message = "First name must be at least 2 symbols")
    @NotBlank
    private String firstName;
    @Min(value = 18, message = "your age can not be below 18")
    private int age;
    @NotNull(message = "Choose your sex")
    private Sex sex;
    @Size(min = 16, max = 16, message = "Please enter 16 numbers")
    private String medicalInsuranceNumber;
//    @NotBlank
    @Email()
    private String email;
    private Map<String, Sex> sexList;
    {
        sexList = new HashMap<>();
        sexList.put("Male", Sex.MALE);
        sexList.put("Female", Sex.FEMALE);

    }

}
