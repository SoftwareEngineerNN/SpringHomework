package com.deadpool.emergencydepartment.entity;


import java.util.List;

public class Examination {
    private int examination_ID;
    private int application_ID;
    private int patient_ID;
    private Doctor doctor;
    private String preliminaryDiagnosis;
    private List<Analyses> analyses;
    private List<Treatment> treatment;
    private List<RadioDiagnosis> radioDiagnosis;
}
