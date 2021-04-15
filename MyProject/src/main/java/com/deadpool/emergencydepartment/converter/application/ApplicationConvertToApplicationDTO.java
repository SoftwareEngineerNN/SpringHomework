package com.deadpool.emergencydepartment.converter.application;

import com.deadpool.emergencydepartment.domain.DTO.ApplicationDTO;
import com.deadpool.emergencydepartment.domain.DTO.DoctorDTO;
import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;
import com.deadpool.emergencydepartment.domain.entity.Application;
import lombok.RequiredArgsConstructor;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;


@RequiredArgsConstructor
public class ApplicationConvertToApplicationDTO
        implements Converter<Application, ApplicationDTO> {

    private final ConversionService conversionService;


    @Override
    public ApplicationDTO convert(Application application) {
        ApplicationDTO applicationDTO = new ApplicationDTO();
        applicationDTO.setPatientDTO(conversionService
        .convert(application.getPatient(), PatientDTO.class));
        applicationDTO.setDoctorDTO(conversionService
        .convert(application.getDoctor(), DoctorDTO.class));
        applicationDTO.setSymptomList(application.getSymptoms());
        return applicationDTO;
    }
}
