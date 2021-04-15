package com.deadpool.emergencydepartment.service.patient;

import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;



import java.util.List;


public interface PatientService {

    List<PatientDTO> getAllPatients();

    PatientDTO getPatientById(long id);

    PatientDTO createNewPatient(PatientDTO patientDTO);

    PatientDTO updatePatient(PatientDTO patientDTO, long id);

    void deletePatientById(long id);

}