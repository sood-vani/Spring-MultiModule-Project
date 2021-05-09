package com.spring.spring2021.repository;

import com.spring.spring2021.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor,Long> {


}
