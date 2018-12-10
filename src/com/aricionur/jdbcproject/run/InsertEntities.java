package com.aricionur.jdbcproject.run;

import java.util.ArrayList;
import java.util.List;

import com.aricionur.jdbcproject.dao.DAO;

public class InsertEntities {
	
	public static void main(String[] args) {
		
		String SQL;
		DAO dao = new DAO();
		
		SQL = "INSERT INTO hospital_viajdbc (ID,NAME) VALUES (1,'HospitalOne')";
		dao.insert(SQL);
		
		SQL = "INSERT INTO patient_viajdbc (ID,NAME) VALUES (2,'PatientOne')";
		dao.insert(SQL);
		SQL = "INSERT INTO patient_viajdbc (ID,NAME) VALUES (3,'PatientTwo')";
		dao.insert(SQL);
		SQL = "INSERT INTO patient_viajdbc (ID,NAME) VALUES (4,'PatientThree')";
		dao.insert(SQL);
		
		SQL = "INSERT INTO hospital_patient (hospital_id,patient_id) VALUES (1,2)";
		dao.insert(SQL);
		SQL = "INSERT INTO hospital_patient (hospital_id,patient_id) VALUES (1,3)";
		dao.insert(SQL);
		SQL = "INSERT INTO hospital_patient (hospital_id,patient_id) VALUES (1,4)";
		dao.insert(SQL);
		
		SQL = "INSERT INTO doctor_viajdbc (ID,NAME) VALUES (5,'DoctorOne')";
		dao.insert(SQL);
		SQL = "INSERT INTO doctor_patient (DOCTOR_ID,PATIENT_ID) VALUES (5,2)";
		dao.insert(SQL);
		SQL = "INSERT INTO doctor_patient (DOCTOR_ID,PATIENT_ID) VALUES (5,3)";
		dao.insert(SQL);
		SQL = "INSERT INTO doctor_patient (DOCTOR_ID,PATIENT_ID) VALUES (5,4)";
		dao.insert(SQL);
		
		SQL = "INSERT INTO doctor_viajdbc (ID,NAME) VALUES (6,'DoctorTwo')";
		dao.insert(SQL);
		SQL = "INSERT INTO doctor_patient (DOCTOR_ID,PATIENT_ID) VALUES (6,2)";
		dao.insert(SQL);
		SQL = "INSERT INTO doctor_patient (DOCTOR_ID,PATIENT_ID) VALUES (6,3)";
		dao.insert(SQL);
		SQL = "INSERT INTO doctor_patient (DOCTOR_ID,PATIENT_ID) VALUES (6,4)";
		dao.insert(SQL);
		
		SQL = "INSERT INTO doctor_viajdbc (ID,NAME) VALUES (7,'DoctorThree')";
		dao.insert(SQL);
		SQL = "INSERT INTO doctor_patient (DOCTOR_ID,PATIENT_ID) VALUES (7,2)";
		dao.insert(SQL);
		SQL = "INSERT INTO doctor_patient (DOCTOR_ID,PATIENT_ID) VALUES (7,3)";
		dao.insert(SQL);
		SQL = "INSERT INTO doctor_patient (DOCTOR_ID,PATIENT_ID) VALUES (7,4)";
		dao.insert(SQL);
		
		

		
	}
	

}
