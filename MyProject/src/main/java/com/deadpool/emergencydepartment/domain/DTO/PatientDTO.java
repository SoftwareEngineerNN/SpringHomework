package com.deadpool.emergencydepartment.domain.DTO;

import com.deadpool.emergencydepartment.domain.enums.Roles;
import com.deadpool.emergencydepartment.domain.enums.Sex;

import lombok.*;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


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
    private Date birthDay;
    @NotNull(message = "Choose your sex")
    private Sex sex;
    private Roles roles;
    @Size(min = 16, max = 16, message = "Please enter 16 numbers")
    private String medicalInsuranceNumber;
    @Email
    private String email;


}
