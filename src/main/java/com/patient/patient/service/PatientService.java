package com.patient.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.patient.exception.TokenAlreadyExistException;
import com.patient.patient.exception.TokenNotFoundException;
import com.patient.patient.repository.PatientRepository;
import com.patient.patientEntity.PatientEntity;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	//create the patient data
	public PatientEntity createPatient(PatientEntity patientEntity) {
		return patientRepository.save(patientEntity);
		
	}
	//get the patient data --> simple one below one is hard you can comment anyone
	public PatientEntity getByPatientToken(Integer patientToken) {
		return patientRepository.findById(patientToken).orElseThrow(() -> new TokenNotFoundException("patient with token" + patientToken + "not found..!!"));
	}
	
	
	//Updating the patient details by Id
	public PatientEntity updatePatientBytoken(PatientEntity patientEntity) {
		if (patientEntity.getPatientToken()!=null) {
			throw new TokenAlreadyExistException("patient with token" + patientEntity.getPatientToken() + " already exists bro..!");
		}
		return patientRepository.save(patientEntity);
	}
	
	//delete the patient by Id
	public void deletePatientByToken(PatientEntity patientEntity) {
		if(patientEntity.getPatientToken()==null) {
			throw new TokenNotFoundException("Patient with token: "+ patientEntity.getPatientToken()+ "not exists to delete bro...!");
		}
		
	}
	
	//get by patient Id
	public PatientEntity getPatientById(Integer patientToken) {
		PatientEntity patientEntity = patientRepository.findById(patientToken)
										.orElseThrow(()-> new TokenNotFoundException("Patient with token: "+ patientToken+ "not found sorry bro..found..!"));
		if(patientEntity.getPatientToken()==null) {
			throw new TokenNotFoundException("Patient with token: "+ patientEntity.getPatientToken()+ "not found sorry bro..found..!");
		}
	return patientEntity;
	}

}
