package com.deadpool.emergencydepartment.domain.entity;


import com.deadpool.emergencydepartment.domain.enums.Analyses;
import com.deadpool.emergencydepartment.domain.enums.RadioDiagnosis;
import com.deadpool.emergencydepartment.domain.enums.Treatment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "examinations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Examination extends Base{

    @OneToOne(mappedBy = "examinationOfApp", cascade = CascadeType.ALL)
    private Application application;

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


    @Override
    public String toString() {
        return "Examination{" +
                "application=" + application +
                ", preliminaryDiagnosis='" + preliminaryDiagnosis + '\'' +
                '}';
    }
}
