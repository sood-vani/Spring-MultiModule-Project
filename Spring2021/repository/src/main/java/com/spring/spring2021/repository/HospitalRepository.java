package com.spring.spring2021.repository;

import com.spring.spring2021.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {

}
