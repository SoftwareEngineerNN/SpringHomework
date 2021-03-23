package com.deadpool.emergencydepartment.entity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Application application = new Application();
        List<Symptom> symptomList = new ArrayList<>();
        symptomList.add(Symptom.HEADACHE);
        symptomList.add(Symptom.CHEST_PAIN);
        symptomList.add(Symptom.ABDOMINAL_PAIN);
        symptomList.add(Symptom.VOMIT);

        application.setSymptoms(symptomList);
        System.out.println(application.getSymptoms());
    }
}
