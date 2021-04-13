package com.deadpool.emergencydepartment.domain.DTO;

import com.deadpool.emergencydepartment.domain.enums.Symptom;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ApplicationDTO {

    private PatientDTO patientDTO;
    private List<Symptom> symptomList;


}
