package com.deadpool.emergencydepartment.service.examination;

import com.deadpool.emergencydepartment.domain.DTO.ExaminationDTO;
import com.deadpool.emergencydepartment.domain.entity.Examination;
import com.deadpool.emergencydepartment.repository.examination.ExaminationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ExaminationServiceImpl implements ExaminationService{

    private final ExaminationRepository examinationRepository;
    @Qualifier("conversionServiceForApp")
    private final ConversionService conversionServiceForApp;

    @Override
    public List<ExaminationDTO> getAllExaminations() {

        return examinationRepository.findAll()
                .stream()
                .map(examination -> conversionServiceForApp
                        .convert(examination, ExaminationDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ExaminationDTO getExaminationById(long id) {
        return conversionServiceForApp
                .convert(examinationRepository.getOne(id), ExaminationDTO.class);
    }

    @Override
    public ExaminationDTO createNewExaminations(ExaminationDTO examinationDTO) {
        Examination examination = conversionServiceForApp.convert(examinationDTO, Examination.class);
        Examination result = examinationRepository.save(examination);
        return conversionServiceForApp.convert(result, ExaminationDTO.class);
    }

    @Override
    public ExaminationDTO updateExamination(ExaminationDTO examinationDTO, long id) {
        Examination examination = conversionServiceForApp.convert(examinationDTO, Examination.class);
        examination.setId(id);
        Examination result = examinationRepository.save(examination);
        return conversionServiceForApp.convert(result, ExaminationDTO.class);
    }

    @Override
    public void deleteExaminationById(long id) {
        examinationRepository.deleteById(id);
    }
}
