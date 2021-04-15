package com.deadpool.emergencydepartment.converter.patient;

import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;
import com.deadpool.emergencydepartment.domain.entity.Patient;
import com.deadpool.emergencydepartment.domain.enums.Role;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PatientDTOConvertToPatient implements Converter<PatientDTO, Patient> {
    @Override
    public Patient convert(PatientDTO patientDTO) {
        Patient patient = new Patient();
        patient.setFirstName(patientDTO.getFirstName());
        patient.setLastName(patientDTO.getLastName());
        //patient.setBirthDay(patientDTO.getBirthDay());
        patient.setAge(patientDTO.getAge());
        patient.setSex(patientDTO.getSex());
        patient.setMedicalInsuranceNumber(patientDTO.getMedicalInsuranceNumber());
        patient.setEmail(patientDTO.getEmail());
        patient.setRole(Role.PATIENT);
        return patient;
    }
}
