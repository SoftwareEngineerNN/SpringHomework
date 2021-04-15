package com.deadpool.emergencydepartment.service.examination;

import com.deadpool.emergencydepartment.domain.DTO.ExaminationDTO;

import java.util.List;

public interface ExaminationService {

    List<ExaminationDTO> getAllExaminations();

    ExaminationDTO getExaminationById(long id);

    ExaminationDTO createNewExaminations(ExaminationDTO examinationDTO);

    ExaminationDTO updateExamination(ExaminationDTO examinationDTO, long id);

    void deleteExaminationById(long id);
}
