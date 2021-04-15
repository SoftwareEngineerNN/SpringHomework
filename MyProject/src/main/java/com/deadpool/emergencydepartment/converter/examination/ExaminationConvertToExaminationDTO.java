package com.deadpool.emergencydepartment.converter.examination;

import com.deadpool.emergencydepartment.domain.DTO.DoctorDTO;
import com.deadpool.emergencydepartment.domain.DTO.ExaminationDTO;
import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;
import com.deadpool.emergencydepartment.domain.entity.Examination;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class ExaminationConvertToExaminationDTO
        implements Converter <Examination, ExaminationDTO> {

    private final ConversionService conversionService;


    @Override
    public ExaminationDTO convert(Examination examination) {
        ExaminationDTO examinationDTO = new ExaminationDTO();
        examinationDTO.setPatientDTO(conversionService
                .convert(examination.getPatient(), PatientDTO.class));
        examinationDTO.setDoctorDTO(conversionService
                .convert(examination.getDoctor(), DoctorDTO.class));
        examinationDTO.setAnalyses(examination.getAnalyses());
        examinationDTO.setRadioDiagnosis(examination.getRadioDiagnosis());
        examinationDTO.setTreatment(examination.getTreatment());
        return examinationDTO;
    }
}
