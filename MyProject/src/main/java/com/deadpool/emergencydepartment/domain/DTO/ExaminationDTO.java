package com.deadpool.emergencydepartment.domain.DTO;

import com.deadpool.emergencydepartment.domain.entity.Doctor;
import com.deadpool.emergencydepartment.domain.entity.Patient;
import com.deadpool.emergencydepartment.domain.enums.Analyses;
import com.deadpool.emergencydepartment.domain.enums.RadioDiagnosis;
import com.deadpool.emergencydepartment.domain.enums.Treatment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ExaminationDTO {

    private PatientDTO patientDTO;
    private DoctorDTO doctorDTO;
    private String preliminaryDiagnosis;
    private List<Analyses> analyses;
    private List<Treatment> treatment;
    private List<RadioDiagnosis> radioDiagnosis;
}
