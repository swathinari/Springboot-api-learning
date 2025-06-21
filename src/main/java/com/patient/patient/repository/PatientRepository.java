package com.patient.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.patientEntity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity,Integer> {

}
