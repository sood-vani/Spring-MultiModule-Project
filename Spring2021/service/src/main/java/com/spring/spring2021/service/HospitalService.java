package com.spring.spring2021.service;

import com.spring.spring2021.entity.Hospital;
import com.spring.spring2021.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class HospitalService {

    @Autowired
     private HospitalRepository hospitalRepository;

    @PostConstruct
    public void initHospital()
    {
       saveHospital();
    }
    
     public void saveHospital()
    {
        Hospital hospitalDetails=new Hospital(1L,"Fortis","Gurgaon","Sector7","7508914499");
        hospitalRepository.save(hospitalDetails);
    }

    public List<Hospital> getHospitals()
    {
       return hospitalRepository.findAll();
    }

}
