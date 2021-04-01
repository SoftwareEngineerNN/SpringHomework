package com.deadpool.emergencydepartment.domain.entity;


import com.deadpool.emergencydepartment.enums.Analyses;
import com.deadpool.emergencydepartment.enums.RadioDiagnosis;
import com.deadpool.emergencydepartment.enums.Treatment;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Examination {
    private int id;
    private Doctor doctor;
    private String preliminaryDiagnosis;
    private List<Analyses> analyses;
    private List<Treatment> treatment;
    private List<RadioDiagnosis> radioDiagnosis;
}
