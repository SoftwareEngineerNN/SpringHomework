package com.deadpool.emergencydepartment;

import com.deadpool.emergencydepartment.converter.patient.PatientConvertToPatientDTO;
import com.deadpool.emergencydepartment.converter.patient.PatientDTOConvertToPatient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@SpringBootApplication
public class HospitalApplication {

    @Bean
    public ConversionService conversionService(){
        DefaultConversionService service = new DefaultConversionService();
        service.addConverter(new PatientConvertToPatientDTO());
        service.addConverter(new PatientDTOConvertToPatient());
        return service;
    }

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);


    }
}


