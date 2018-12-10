package com.aricionur.jdbcproject.run;

import java.util.List;

import com.aricionur.jdbcproject.dao.ADao;
import com.aricionur.jdbcproject.dao.DAO;
import com.aricionur.jdbcproject.dao.DoctorDAO;
import com.aricionur.jdbcproject.dao.HospitalDAO;
import com.aricionur.jdbcproject.dao.PatientDAO;
import com.aricionur.jdbcproject.entity.Doctor;
import com.aricionur.jdbcproject.entity.Hospital;
import com.aricionur.jdbcproject.entity.Patient;

public class ReadTables {

	public static void main(String[] args) {
		ADao aADao = new HospitalDAO();

		List<Object> objectList = aADao.read();
		Hospital hospital;
		for (Object eachObject : objectList) {
			hospital = (Hospital) eachObject;
			System.out.println("Hospital name : " + hospital.getName());
		}

		objectList.clear();

		aADao = new PatientDAO();
		objectList = aADao.read();
		Patient patient;
		for (Object eachObject : objectList) {
			patient = (Patient) eachObject;
			System.out.println("Patient name : " + patient.getName());
		}

		objectList.clear();

		aADao = new DoctorDAO();
		objectList = aADao.read();
		Doctor doctor;
		for (Object eachObject : objectList) {
			doctor = (Doctor) eachObject;
			System.out.println("Patient name : " + doctor.getName());
		}

	}

}
