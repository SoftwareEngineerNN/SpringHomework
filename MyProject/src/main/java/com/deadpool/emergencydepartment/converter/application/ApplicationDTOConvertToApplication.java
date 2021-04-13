package com.deadpool.emergencydepartment.converter.application;

import com.deadpool.emergencydepartment.domain.DTO.ApplicationDTO;
import com.deadpool.emergencydepartment.domain.entity.Application;
import org.springframework.core.convert.converter.Converter;

public class ApplicationDTOConvertToApplication
        implements Converter<ApplicationDTO, Application> {
    @Override
    public Application convert(ApplicationDTO applicationDTO) {
        Application application = new Application();


        return application;
    }
}
