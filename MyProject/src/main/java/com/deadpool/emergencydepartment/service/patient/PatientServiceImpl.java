package com.deadpool.emergencydepartment.service.patient;

import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;
import com.deadpool.emergencydepartment.domain.entity.Patient;
import com.deadpool.emergencydepartment.domain.enums.Roles;
import com.deadpool.emergencydepartment.repository.patient.PatientRepository;

import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<PatientDTO> getAllPatients() {
        return patientRepository.findAll()
                .stream()
                .map(patient -> modelMapper.map(patient, PatientDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PatientDTO getPatientById(long id) {

        return modelMapper.map(patientRepository.getOne(id), PatientDTO.class);
    }

    @Override
    public PatientDTO createNewPatient(PatientDTO patientDTO) {

        Patient patient = modelMapper.map(patientDTO, Patient.class);
        patient.setRoles(Roles.PATIENT);
        Patient result = patientRepository.save(patient);

        return modelMapper.map(result, PatientDTO.class);
    }

    @Override
    public PatientDTO updatePatient(PatientDTO patientDTO, long id) {
        Patient patient = modelMapper.map(patientDTO, Patient.class);
        patient.setId(id);
        Patient result = patientRepository.save(patient);
        return modelMapper.map(result, PatientDTO.class);
    }


    @Override
    public void deletePatientById(long id) {
        patientRepository.deleteById(id);
    }


}
