package com.spring.spring2021.controller;


import com.spring.spring2021.entity.Doctor;
import com.spring.spring2021.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/getDoctorDetails")
    public List<Doctor> showDoctorDetails()
    {
        return doctorService.getDoctors();
    }
}
