package com.aricionur.jdbcproject.entity;

import java.util.ArrayList;
import java.util.List;


public class Patient {

	int id;
	String name;
	int hospitalId;
	
	public Patient(int id, String name, int hospital_id) {
		this.id = id;
		this.name = name;
		this.hospitalId = hospital_id;
	}
//	@OneToOne
//	Hospital hospital;
	
//	@ManyToMany(mappedBy = "patientList")
//	List<Doctor> doctorList = new ArrayList<>();

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
	
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public int getHospitalId() {
		return hospitalId;
	}

//	public String getPatientComplaint() {
//		return patientComplaint;
//	}
//
//	public void setPatientComplaint(String patientComplaint) {
//		this.patientComplaint = patientComplaint;
//	}
//
//	public List<Doctor> getDoctorList() {
//		return doctorList;
//	}
//
//	public void setDoctorList(List<Doctor> doctorList) {
//		this.doctorList = doctorList;
//	}
//
//	public Hospital getHospital() {
//		return hospital;
//	}
//
//	public void setHospital(Hospital hospital) {
//		this.hospital = hospital;
//	}
	
	
	
}
