package com.deadpool.emergencydepartment.repository.examination;

import com.deadpool.emergencydepartment.domain.entity.Examination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExaminationRepository extends JpaRepository<Examination, Long> {
}
