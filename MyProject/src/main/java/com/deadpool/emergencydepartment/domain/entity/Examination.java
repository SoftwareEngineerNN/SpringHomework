package com.deadpool.emergencydepartment.domain.entity;


import com.deadpool.emergencydepartment.domain.enums.Analyses;
import com.deadpool.emergencydepartment.domain.enums.RadioDiagnosis;
import com.deadpool.emergencydepartment.domain.enums.Treatment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "examinations")
@NoArgsConstructor
@Getter
@Setter
public class Examination extends Base{


    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    private String preliminaryDiagnosis;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Analyses.class)
    @CollectionTable(name = "examination_analyses")
    private List<Analyses> analyses;
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Treatment.class)
    @CollectionTable(name = "examination_treatment")
    private List<Treatment> treatment;
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = RadioDiagnosis.class)
    @CollectionTable(name = "examination_radiodiagnosis")
    private List<RadioDiagnosis> radioDiagnosis;

    public Examination(Patient patient, Doctor doctor, String preliminaryDiagnosis) {
        this.patient = patient;
        this.doctor = doctor;
        this.preliminaryDiagnosis = preliminaryDiagnosis;
    }

    @Override
    public String toString() {
        return "Examination{" +

                "patient=" + patient +
                ", doctor=" + doctor +
                ", preliminaryDiagnosis='" + preliminaryDiagnosis + '\'' +
                '}';
    }
}
