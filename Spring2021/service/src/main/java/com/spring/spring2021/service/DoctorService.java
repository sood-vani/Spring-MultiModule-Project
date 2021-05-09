package com.spring.spring2021.service;


import com.spring.spring2021.entity.Doctor;
import com.spring.spring2021.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostConstruct
    //what would have happened if I had not used it
    public void initDoc()
    {
        saveDoctor();
    }

    public void saveDoctor()
    {
        Doctor doctorDetails=new Doctor(1L,"Dr John","Orthopedician");
        doctorRepository.save(doctorDetails);
    }

    public List<Doctor> getDoctors()
    {
        return doctorRepository.findAll();
    }

}
