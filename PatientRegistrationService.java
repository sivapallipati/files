package com.adalitek.mph.service;

import com.adalitek.mph.model.PatientRegistration;

public interface PatientRegistrationService {
	
	public PatientRegistration findUserByEmail(String email);
	 
	public void savePatientRegistration(PatientRegistration patient);
	
}
