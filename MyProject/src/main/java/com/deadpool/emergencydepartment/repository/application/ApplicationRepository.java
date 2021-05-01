package com.deadpool.emergencydepartment.repository.application;

import com.deadpool.emergencydepartment.domain.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
