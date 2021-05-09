package com.spring.spring2021.service;

import com.spring.spring2021.entity.Patient;
import com.spring.spring2021.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @PostConstruct
    public void init()
    {
        savePatients();
    }
    public void savePatients()
    {
        Patient patientDetails=new Patient(1L,"Avni","20");
        patientRepository.save(patientDetails);
    }
    public List<Patient> getPatients()
    {
        return patientRepository.findAll();
    }
}

