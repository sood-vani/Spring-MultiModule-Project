package com.spring.spring2021.controller;
import com.spring.spring2021.entity.Hospital;
import com.spring.spring2021.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//        @RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/getHospitalDetails")
    public List<Hospital> showHospitalDetails()
    {
        return hospitalService.getHospitals();
    }

//    @PostMapping("/setHospitalDetails")
//    public void saveHospitalDetails(@RequestBody Hospital)
//    {
//        hospitalService.saveHospital(Hospital);
//    }


}
