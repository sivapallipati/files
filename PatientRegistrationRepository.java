package com.adalitek.mph.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adalitek.mph.model.PatientRegistration;


@Repository("patientRegistrationRepository")
public interface PatientRegistrationRepository extends JpaRepository<PatientRegistration, Long>{

PatientRegistration findByEmail(String email);
}