package com.deadpool.emergencydepartment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    private int applicationID;
    private int patientID;
    private List<Symptom> symptoms;




}
