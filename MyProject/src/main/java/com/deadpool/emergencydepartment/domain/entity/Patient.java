package com.deadpool.emergencydepartment.domain.entity;

import com.deadpool.emergencydepartment.domain.enums.Role;
import com.deadpool.emergencydepartment.domain.enums.Sex;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "patients")
@Data
@NoArgsConstructor
public class Patient extends Base{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String lastName;
    private String firstName;
    private int age;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private String medicalInsuranceNumber;
    private String email;

}
