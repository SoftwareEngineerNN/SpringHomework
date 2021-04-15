package com.deadpool.emergencydepartment.converter.examination;

import com.deadpool.emergencydepartment.domain.DTO.ExaminationDTO;
import com.deadpool.emergencydepartment.domain.entity.Doctor;
import com.deadpool.emergencydepartment.domain.entity.Examination;
import com.deadpool.emergencydepartment.domain.entity.Patient;
import lombok.RequiredArgsConstructor;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

@RequiredArgsConstructor
public class ExaminationDTOConvertToExamination
        implements Converter<ExaminationDTO, Examination> {
    private final ConversionService conversionService;

    @Override
    public Examination convert(ExaminationDTO examinationDTO) {
        Examination examination = new Examination();
        examination.setPatient(conversionService
        .convert(examinationDTO.getPatientDTO(), Patient.class));
        examination.setDoctor(conversionService
        .convert(examinationDTO.getDoctorDTO(), Doctor.class));
        examination.setPreliminaryDiagnosis(examinationDTO.getPreliminaryDiagnosis());
        examination.setAnalyses(examinationDTO.getAnalyses());
        examination.setRadioDiagnosis(examinationDTO.getRadioDiagnosis());
        examination.setTreatment(examinationDTO.getTreatment());
        return examination;
    }
}
