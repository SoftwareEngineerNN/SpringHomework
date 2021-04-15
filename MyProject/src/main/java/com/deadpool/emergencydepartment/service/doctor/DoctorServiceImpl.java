package com.deadpool.emergencydepartment.service.doctor;

import com.deadpool.emergencydepartment.domain.DTO.DoctorDTO;
import com.deadpool.emergencydepartment.domain.entity.Doctor;
import com.deadpool.emergencydepartment.repository.doctor.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.print.Doc;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService{

    private final DoctorRepository doctorRepository;
    private final ConversionService conversionService;


    @Override
    public List<DoctorDTO> getAllDoctors() {

        return doctorRepository.findAll()
                .stream()
                .map(doctor -> conversionService.convert(doctor, DoctorDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public DoctorDTO getDoctorById(long id) {
        return conversionService.convert(doctorRepository.getOne(id), DoctorDTO.class);
    }

    @Override
    public DoctorDTO createNewDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = conversionService.convert(doctorDTO, Doctor.class);
        Doctor result = doctorRepository.save(doctor);
        return conversionService.convert(result, DoctorDTO.class);
    }

    @Override
    public DoctorDTO updateDoctor(DoctorDTO doctorDTO, long id) {
        Doctor doctor = conversionService.convert(doctorDTO, Doctor.class);
        doctor.setId(id);
        Doctor result = doctorRepository.save(doctor);
        return conversionService.convert(result, DoctorDTO.class);
    }

    @Override
    public void deleteDoctorById(long id) {
        doctorRepository.deleteById(id);
    }
}
