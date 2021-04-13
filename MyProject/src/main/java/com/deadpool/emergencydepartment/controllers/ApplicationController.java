package com.deadpool.emergencydepartment.controllers;

import com.deadpool.emergencydepartment.domain.DTO.ApplicationDTO;
import com.deadpool.emergencydepartment.service.application.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/patients")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @GetMapping
    public String showApplicationForm(Model model) {
        return "application";
    }

    @PostMapping("/{patientId}/applications")
    public ApplicationDTO createNewApplication(
            @PathVariable("patientId") long id,
            @RequestBody ApplicationDTO applicationDTO) {
        applicationService.saveOrUpdate(applicationDTO);
        return applicationDTO;
    }
}
