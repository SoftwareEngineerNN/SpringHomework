package com.deadpool.emergencydepartment.controllers;

import com.deadpool.emergencydepartment.domain.DTO.DoctorDTO;
import com.deadpool.emergencydepartment.repository.doctor.DoctorRepository;
import com.deadpool.emergencydepartment.service.doctor.DoctorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorServiceImpl doctorService;
    private final ConversionService conversionService;

    @GetMapping("/doctors")
    public List<DoctorDTO> getAllDoctors() {

        return doctorService.getAllDoctors();
    }

    @PostMapping("/doctors")
    public DoctorDTO addNewDoctor(@RequestBody DoctorDTO doctorDTO) {

        return doctorService.createNewDoctor(doctorDTO);

    }
}
