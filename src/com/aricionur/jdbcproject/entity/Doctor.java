package com.aricionur.jdbcproject.entity;

public class Doctor {

	int id;
	String name;

	public Doctor(int id, String name) {
		this.id = id;
		this.name= name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	String fieldOfStudy;
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "doctor_patient", joinColumns=@JoinColumn(name="doctor_id"), inverseJoinColumns=@JoinColumn(name="patient_id"))
//	List<Patient> patientList = new ArrayList<>();
//	public String getFieldOfStudy() {
//		return fieldOfStudy;
//	}
//
//	public void setFieldOfStudy(String fieldOfStudy) {
//		this.fieldOfStudy = fieldOfStudy;
//	}
//
//	public List<Patient> getPatientList() {
//		return patientList;
//	}
//
//	public void setPatientList(List<Patient> patientList) {
//		this.patientList = patientList;
//	}

	
	
	

}
