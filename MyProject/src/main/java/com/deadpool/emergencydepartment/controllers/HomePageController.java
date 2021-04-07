package com.deadpool.emergencydepartment.controllers;

import com.deadpool.emergencydepartment.domain.DTO.PatientDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;


@Controller
public class HomePageController {

    @GetMapping("/home")
    public String getHomePage(){
        return "home";
    }

    @GetMapping("/registry")
    public String showRegistryForm(Model model){
        model.addAttribute("patient", new PatientDTO());
        return "registry";
    }

    @GetMapping("/registry-new")
    public String newPatientShowing(@Valid @ModelAttribute("patient") PatientDTO patientDTO,
                                    BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registry";
        }

        return "show_patient_data";
    }
}
