package com.patient.patientEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity				//it marks class as the entity 
public class PatientEntity implements Serializable{
	
	
	/**
	 * Swathi don't get shock you only wrote all each line.
	 * created default seriaVersion Id (for serialization and deserialization of objects)
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id					//for making this as Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)			//generating the id values automatically, no need to pass id value while testing API
	Integer patientToken;
	String patientName;
	String location;
	Long temperature;
	Integer bloodPressure;
	
	//default constructor
	public PatientEntity() {
		
	}
	
	// these all are setter and getters methods for data members
	public Integer getPatientToken() {
		return patientToken;
	}
	public void setPatientToken(Integer patientToken) {
		this.patientToken = patientToken;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getTemperature() {
		return temperature;
	}
	public void setTemperature(Long temperature) {
		this.temperature = temperature;
	}
	public Integer getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(Integer bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	
	@Override
	public String toString() {			//using toString for better representation of object in string with comma separated
		return "PatientEntity [patientToken=" + patientToken + ", patientName=" + patientName + ", location=" + location
				+ ", temperature=" + temperature + ", bloodPressure=" + bloodPressure + ", getPatientToken()="
				+ getPatientToken() + ", getPatientName()=" + getPatientName() + ", getLocation()=" + getLocation()
				+ ", getTemperature()=" + getTemperature() + ", getBloodPressure()=" + getBloodPressure()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	//parameterized constructors
	public PatientEntity(Integer patientToken, String patientName, String location, Long temperature,
			Integer bloodPressure) {
		super();
		this.patientToken = patientToken;
		this.patientName = patientName;
		this.location = location;
		this.temperature = temperature;
		this.bloodPressure = bloodPressure;
	}
	
	//simply add this as it's giving some suggestion for serialization
	public static long getSeriaversionuid() {
		return serialVersionUID;
	}
	

}
