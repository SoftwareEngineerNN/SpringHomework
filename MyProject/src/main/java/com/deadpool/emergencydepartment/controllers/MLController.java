package com.deadpool.emergencydepartment.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;


@RestController
public class MLController {

    @GetMapping("/neuro/model")
    public ModelDTO getNeuroModel() {
        ModelDTO modelDTO = new ModelDTO();
        modelDTO.setFileExtension("txt");
        modelDTO.setFileName("model");
        File file = new File("C:\\Java\\Orion\\MyProject\\src\\main\\resources\\ML_Models\\model.txt");
        modelDTO.setFileString(encodeFileToBase64(file));
        return modelDTO;
    }

    private String encodeFileToBase64(File file) {
        try { byte[] fileContent = Files.readAllBytes(file.toPath());
        return Base64.getEncoder().encodeToString(fileContent);
        } catch (IOException e) {
            throw new IllegalStateException("could not read file " + file, e);
        }
    }
}
