package com.aricionur.jdbcproject.entity;

import java.util.ArrayList;
import java.util.List;


public class Hospital {

	int id;
	String name;

	public Hospital(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
//	List<Patient> patientList = new ArrayList<>();
//
//	public void setPatientList(List<Patient> patientList) {
//		this.patientList = patientList;
//	}
//
//	public List<Patient> getPatientList() {
//		return patientList;
//	}

}
