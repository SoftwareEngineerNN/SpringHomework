package com.deadpool.emergencydepartment.domain.entity;

import com.deadpool.emergencydepartment.domain.enums.Roles;
import com.deadpool.emergencydepartment.domain.enums.Sex;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "patients")
@Data
@NoArgsConstructor
public class Patient extends Base{

    @Enumerated(EnumType.STRING)
    private Roles roles;
    private String lastName;
    private String firstName;
    private Date birthDay;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private String medicalInsuranceNumber;
    private String email;

}
