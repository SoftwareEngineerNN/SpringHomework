package com.deadpool.emergencydepartment.service.application;

import com.deadpool.emergencydepartment.domain.DTO.ApplicationDTO;
import com.deadpool.emergencydepartment.domain.entity.Application;
import com.deadpool.emergencydepartment.repository.application.ApplicationRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService{

    private final ApplicationRepository applicationRepository;
    @Qualifier("conversionServiceForApp")
    private final ConversionService conversionServiceForApp;


    @Override
    public List<ApplicationDTO> getAllApplications() {

        return applicationRepository.findAll()
                .stream()
                .map(application -> conversionServiceForApp
                .convert(application, ApplicationDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ApplicationDTO getApplicationById(long id) {
        return conversionServiceForApp.convert(applicationRepository.getOne(id), ApplicationDTO.class);
    }

    @Override
    public ApplicationDTO createNewApplication(ApplicationDTO applicationDTO) {
        Application application =
                conversionServiceForApp.convert(applicationDTO, Application.class);
        Application result = applicationRepository.save(application);
        return conversionServiceForApp.convert(result, ApplicationDTO.class);
    }

    @Override
    public ApplicationDTO updateApplication(ApplicationDTO applicationDTO, long id) {
        Application application =
                conversionServiceForApp.convert(applicationDTO, Application.class);
        application.setId(id);

        Application result = applicationRepository.save(application);
        return conversionServiceForApp.convert(result, ApplicationDTO.class);
    }


    @Override
    public void deleteApplicationById(long id) {
        applicationRepository.deleteById(id);
    }
}
