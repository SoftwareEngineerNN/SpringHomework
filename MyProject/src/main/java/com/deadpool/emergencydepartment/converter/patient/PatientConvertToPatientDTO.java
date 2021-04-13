package com.deadpool.emergencydepartment.converter.patient;

import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;
import com.deadpool.emergencydepartment.domain.entity.Patient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PatientConvertToPatientDTO implements Converter<Patient, PatientDTO> {
    @Override
    public PatientDTO convert(Patient patient) {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setFirstName(patient.getFirstName());
        patientDTO.setLastName(patient.getLastName());
        patientDTO.setAge(patient.getAge());
        patientDTO.setSex(patient.getSex());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setMedicalInsuranceNumber(patient.getMedicalInsuranceNumber());

        return patientDTO;
    }
}
