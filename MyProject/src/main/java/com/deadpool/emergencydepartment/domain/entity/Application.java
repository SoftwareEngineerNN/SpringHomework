package com.deadpool.emergencydepartment.domain.entity;

import com.deadpool.emergencydepartment.domain.enums.Symptom;
import lombok.*;

import javax.persistence.*;
import java.util.List;



@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "applications")
public class Application extends Base {


    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Symptom.class)
    @CollectionTable(name = "application_symptom")
    private List<Symptom> symptoms;
    private boolean isHandled;


    public Application(Patient patient, Doctor doctor, List<Symptom> symptoms, boolean isHandled) {
        this.patient = patient;
        this.doctor = doctor;
        this.symptoms = symptoms;
        this.isHandled = isHandled;
    }

    @Override
    public String toString() {
        return "Application{" +
                "patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }
}