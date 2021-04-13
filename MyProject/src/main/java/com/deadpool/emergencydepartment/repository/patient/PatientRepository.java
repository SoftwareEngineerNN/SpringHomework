package com.deadpool.emergencydepartment.repository.patient;

import com.deadpool.emergencydepartment.domain.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
