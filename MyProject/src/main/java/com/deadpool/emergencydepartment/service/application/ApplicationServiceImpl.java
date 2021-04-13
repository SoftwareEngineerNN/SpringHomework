package com.deadpool.emergencydepartment.service.application;

import com.deadpool.emergencydepartment.domain.DTO.ApplicationDTO;
import com.deadpool.emergencydepartment.domain.entity.Application;
import com.deadpool.emergencydepartment.repository.application.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService{

    private final ApplicationRepository applicationRepository;
    private final ConversionService conversionService;

    @Override
    public void saveOrUpdate(ApplicationDTO applicationDTO) {
        Application application =
                conversionService.convert(applicationDTO, Application.class);
        applicationRepository.save(application);
    }
}
