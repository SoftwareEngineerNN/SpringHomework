package com.deadpool.emergencydepartment.controllers;

import com.deadpool.emergencydepartment.domain.DTO.ExaminationDTO;
import com.deadpool.emergencydepartment.service.examination.ExaminationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class ExaminationController {

    private final ExaminationService examinationService;

    @GetMapping("/examinations")
    public List<ExaminationDTO> getAllExaminations() {
        return examinationService.getAllExaminations();
    }

    @GetMapping("/examinations/{id}")
    public ExaminationDTO getExaminationById(@PathVariable("id") long id) {
        return examinationService.getExaminationById(id);
    }

    @PostMapping("/examinations")
    public ExaminationDTO createNewExamination(@RequestBody ExaminationDTO examinationDTO) {
        return examinationService.createNewExaminations(examinationDTO);
    }

    @PutMapping("/examinations/{id}")
    public ExaminationDTO updateExamination(@RequestBody ExaminationDTO examinationDTO,
                                            @PathVariable("id") long id) {
        return examinationService.updateExamination(examinationDTO, id);
    }

    @DeleteMapping("/examinations/{id}")
    public String deleteExaminationById(@PathVariable("id") long id) {
        examinationService.deleteExaminationById(id);
        return "Examination with ID = " + id + " was deleted";
    }
}
