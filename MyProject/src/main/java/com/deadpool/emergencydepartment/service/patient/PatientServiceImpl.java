package com.deadpool.emergencydepartment.service.patient;

import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;
import com.deadpool.emergencydepartment.domain.entity.Patient;
import com.deadpool.emergencydepartment.repository.patient.PatientRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;
    private final ConversionService conversionService;


    @Override
    public List<PatientDTO> getAllPatients() {
        return patientRepository.findAll()
                .stream()
                .map(patient -> conversionService.convert(patient, PatientDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PatientDTO getPatientById(long id) {
        Patient patient = patientRepository.getOne(id);
        return conversionService.convert(patient, PatientDTO.class);
    }

    @Override
    public PatientDTO createNewPatient(PatientDTO patientDTO) {
        Patient patient = conversionService.convert(patientDTO, Patient.class);
//        patient.setDate(new Date());
        Patient result = patientRepository.save(patient);
        return conversionService.convert(result, PatientDTO.class);
    }

    @Override
    public PatientDTO updatePatient(PatientDTO patientDTO, long id) {
        Patient patient = conversionService.convert(patientDTO, Patient.class);
        patient.setId(id);
        Patient result = patientRepository.save(patient);
        return conversionService.convert(result, PatientDTO.class);
    }


    @Override
    public void deletePatientById(long id) {
        patientRepository.deleteById(id);
    }
}
