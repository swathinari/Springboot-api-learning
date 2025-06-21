package com.patient.patient.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.patient.service.PatientService;
import com.patient.patientEntity.PatientEntity;

@RestController
@RequestMapping("/com/patient")
public class PatientController {
	
	private PatientService patientService;
	
	@PostMapping
	public PatientEntity getPatient(@RequestBody PatientEntity patientEntity){
		return patientService.createPatient(patientEntity);
	}
	
	@GetMapping("/{patientToken")
	public PatientEntity getPatientByTonken(Integer patientToken) {
		return patientService.getPatientById(patientToken);
	}
	
	@PatchMapping("/patientToken")
	public PatientEntity updatePatientByToken(PatientEntity patientEntity) {
		return patientService.updatePatientBytoken(patientEntity);
	}
	
	@DeleteMapping("/{patientToken")
	public void deletePatientByToken(Integer patientToken) {
		
	}
	
	

}
