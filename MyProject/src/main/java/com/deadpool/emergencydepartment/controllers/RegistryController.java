package com.deadpool.emergencydepartment.controllers;

import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;

import com.deadpool.emergencydepartment.service.patient.PatientService;

import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registry")
@RequiredArgsConstructor
public class RegistryController {

    private final PatientService patientService;

    @GetMapping("/patients")
    public List<PatientDTO> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/patients/{id}")
    public PatientDTO getPatientById(@PathVariable("id") long id) {
        return patientService.getPatientById(id);
    }

    @PostMapping("/patients")
    public PatientDTO addNewPatient(@RequestBody PatientDTO patientDTO) {

        return patientService.createNewPatient(patientDTO);
    }

    @PutMapping("/patients/{id}")
    public PatientDTO updatePatient(@RequestBody PatientDTO patientDTO,
                                    @PathVariable("id") long id ) {

        return patientService.updatePatient(patientDTO, id);
    }


    @DeleteMapping("/patients/{id}")
    public String deletePatientById(@PathVariable("id") long id) {
        patientService.deletePatientById(id);
        return "Patient with ID = " + id + " was deleted";
    }

}
