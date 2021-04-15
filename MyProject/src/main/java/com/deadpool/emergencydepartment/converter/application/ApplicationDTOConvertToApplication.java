package com.deadpool.emergencydepartment.converter.application;

import com.deadpool.emergencydepartment.domain.DTO.ApplicationDTO;
import com.deadpool.emergencydepartment.domain.entity.Application;
import com.deadpool.emergencydepartment.domain.entity.Doctor;
import com.deadpool.emergencydepartment.domain.entity.Patient;
import lombok.RequiredArgsConstructor;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;


@RequiredArgsConstructor
public class ApplicationDTOConvertToApplication
        implements Converter<ApplicationDTO, Application> {

    private final ConversionService conversionService;

    @Override
    public Application convert(ApplicationDTO applicationDTO) {
        Application application = new Application();
        application.setPatient(conversionService
                .convert(applicationDTO.getPatientDTO(), Patient.class));
        application.setDoctor(conversionService
                .convert(applicationDTO.getDoctorDTO(), Doctor.class));
        application.setSymptoms(applicationDTO.getSymptomList());

        return application;
    }
}
