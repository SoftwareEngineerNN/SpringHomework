package com.deadpool.emergencydepartment.service.doctor;

import com.deadpool.emergencydepartment.domain.DTO.DoctorDTO;
import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;

import java.util.List;

public interface DoctorService {

    List<DoctorDTO> getAllDoctors();

    DoctorDTO getDoctorById(long id);

    DoctorDTO createNewDoctor(DoctorDTO doctorDTO);

    DoctorDTO updateDoctor(DoctorDTO doctorDTO, long id);

    void deleteDoctorById(long id);
}
