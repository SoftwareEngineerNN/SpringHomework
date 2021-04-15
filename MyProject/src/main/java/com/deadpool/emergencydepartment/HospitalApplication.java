package com.deadpool.emergencydepartment;

import com.deadpool.emergencydepartment.converter.application.ApplicationConvertToApplicationDTO;
import com.deadpool.emergencydepartment.converter.application.ApplicationDTOConvertToApplication;
import com.deadpool.emergencydepartment.converter.doctor.DoctorConvertToDoctorDTO;
import com.deadpool.emergencydepartment.converter.doctor.DoctorDTOConvertToDoctor;
import com.deadpool.emergencydepartment.converter.examination.ExaminationConvertToExaminationDTO;
import com.deadpool.emergencydepartment.converter.examination.ExaminationDTOConvertToExamination;
import com.deadpool.emergencydepartment.converter.patient.PatientConvertToPatientDTO;
import com.deadpool.emergencydepartment.converter.patient.PatientDTOConvertToPatient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HospitalApplication {

    @Bean
    public ConversionService conversionService(){
        DefaultConversionService service = new DefaultConversionService();
        service.addConverter(new PatientConvertToPatientDTO());
        service.addConverter(new PatientDTOConvertToPatient());
        service.addConverter(new DoctorConvertToDoctorDTO());
        service.addConverter(new DoctorDTOConvertToDoctor());
        return service;
    }

    @Bean(name = "conversionServiceForApp")
    public ConversionService conversionServiceForApp() {
        DefaultConversionService service = new DefaultConversionService();
        service.addConverter(new ApplicationConvertToApplicationDTO(conversionService()));
        service.addConverter(new ApplicationDTOConvertToApplication(conversionService()));
        service.addConverter(new ExaminationConvertToExaminationDTO(conversionService()));
        service.addConverter(new ExaminationDTOConvertToExamination(conversionService()));
        return service;
    }

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);


    }
}


