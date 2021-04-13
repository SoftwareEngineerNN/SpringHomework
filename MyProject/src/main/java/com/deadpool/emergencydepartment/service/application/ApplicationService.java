package com.deadpool.emergencydepartment.service.application;

import com.deadpool.emergencydepartment.domain.DTO.ApplicationDTO;

public interface ApplicationService {

    void saveOrUpdate(ApplicationDTO applicationDTO);
}
