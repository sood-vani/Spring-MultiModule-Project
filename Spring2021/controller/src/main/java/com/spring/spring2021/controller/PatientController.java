package com.spring.spring2021.controller;

import com.spring.spring2021.entity.Patient;
import com.spring.spring2021.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
//@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/getPatientDetails")
    public List<Patient>showPatients()
    {
        return patientService.getPatients();
    }
}
