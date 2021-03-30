package com.deadpool.emergencydepartment.entity;

import com.deadpool.emergencydepartment.enums.Symptom;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private List<Symptom> symptoms;
}
