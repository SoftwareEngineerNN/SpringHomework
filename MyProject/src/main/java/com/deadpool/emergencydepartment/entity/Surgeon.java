package com.deadpool.emergencydepartment.entity;

public class Surgeon implements Doctor{
    private int surgeonID;
    private String lastName;
    private String firstName;
    private int age;
    private Sex sex;
    private int experienceYears;


    @Override
    public void examinePatient(Patient patient) {

    }
}
