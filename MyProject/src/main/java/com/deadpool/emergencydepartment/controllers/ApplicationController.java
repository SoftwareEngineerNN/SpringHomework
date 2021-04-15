package com.deadpool.emergencydepartment.controllers;

import com.deadpool.emergencydepartment.domain.DTO.ApplicationDTO;
import com.deadpool.emergencydepartment.domain.DTO.DoctorDTO;
import com.deadpool.emergencydepartment.domain.entity.Doctor;
import com.deadpool.emergencydepartment.service.application.ApplicationService;
import com.deadpool.emergencydepartment.service.doctor.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;
    private final DoctorService doctorService;




    @GetMapping("/applications")
    public List<ApplicationDTO> getAllApplications() {

        return applicationService.getAllApplications();
    }

    @GetMapping("/applications/{id}")
    public ApplicationDTO getApplicationById(@PathVariable("id") long id) {
        return applicationService.getApplicationById(id);
    }

    @PostMapping("/applications")
    public ApplicationDTO createNewApplication(
                @RequestBody ApplicationDTO applicationDTO) {

        List<DoctorDTO> allDoctors = doctorService.getAllDoctors();
        int id = new Random().nextInt(allDoctors.size()) +1;
        DoctorDTO doctorDTO = allDoctors.get(id);
        applicationDTO.setDoctorDTO(doctorDTO);
        return applicationService.createNewApplication(applicationDTO);
    }

    @PutMapping("/applications/{id}")
    public ApplicationDTO updateApplication(@RequestBody ApplicationDTO applicationDTO,
                                            @PathVariable("id") long id) {
       return applicationService.updateApplication(applicationDTO, id);
    }

    @DeleteMapping("/applications/{id}")
    public String deleteApplicationById(@PathVariable("id") long id) {
        applicationService.deleteApplicationById(id);
        return "Application with ID = " + id + " was deleted";
    }

}
