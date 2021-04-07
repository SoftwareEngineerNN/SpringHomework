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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;@ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Symptom.class)
    @CollectionTable(name = "application_symptom")
    private List<Symptom> symptoms;


    public Application(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Application{" +
                "patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }
}