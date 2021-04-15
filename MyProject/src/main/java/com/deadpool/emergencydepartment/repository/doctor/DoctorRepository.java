package com.deadpool.emergencydepartment.repository.doctor;

import com.deadpool.emergencydepartment.domain.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
