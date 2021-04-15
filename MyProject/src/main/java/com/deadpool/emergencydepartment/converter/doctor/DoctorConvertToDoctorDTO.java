package com.deadpool.emergencydepartment.converter.doctor;


import com.deadpool.emergencydepartment.domain.DTO.DoctorDTO;
import com.deadpool.emergencydepartment.domain.entity.Doctor;
import org.springframework.core.convert.converter.Converter;

public class DoctorConvertToDoctorDTO implements Converter <Doctor, DoctorDTO> {
    @Override
    public DoctorDTO convert(Doctor doctor) {
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setFirstName(doctor.getFirstName());
        doctorDTO.setLastName(doctor.getLastName());
        doctorDTO.setExperienceYears(doctor.getExperienceYears());
        doctorDTO.setSpeciality(doctor.getSpeciality());
        return doctorDTO;
    }
}
