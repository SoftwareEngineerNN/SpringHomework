package com.deadpool.emergencydepartment.service.application;

import com.deadpool.emergencydepartment.domain.DTO.ApplicationDTO;
import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;

import java.util.List;

public interface ApplicationService {

    List<ApplicationDTO> getAllApplications();

    ApplicationDTO getApplicationById(long id);

    ApplicationDTO createNewApplication(ApplicationDTO applicationDTO);

    ApplicationDTO updateApplication(ApplicationDTO applicationDTO, long id);

    void deleteApplicationById(long id);
}
