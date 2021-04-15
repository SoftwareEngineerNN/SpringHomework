package com.deadpool.emergencydepartment.converter.doctor;

import com.deadpool.emergencydepartment.domain.DTO.DoctorDTO;
import com.deadpool.emergencydepartment.domain.entity.Doctor;
import org.springframework.core.convert.converter.Converter;

// do we need this converter? We got all info about doctors from DB
public class DoctorDTOConvertToDoctor implements Converter<DoctorDTO, Doctor> {
    @Override
    public Doctor convert(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor();
        doctor.setFirstName(doctorDTO.getFirstName());
        doctor.setLastName(doctorDTO.getLastName());
        doctor.setExperienceYears(doctorDTO.getExperienceYears());
        doctor.setSpeciality(doctorDTO.getSpeciality());
        return doctor;
    }
}
