package com.aricionur.jdbcproject.run;

import com.aricionur.jdbcproject.dao.DAO;

public class CreateTables {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String createHospitalTable = "CREATE TABLE `jdbcshema`.`hospital_viajdbc` ( "+
					 "`id` INT NOT NULL,"+
					 "`name` VARCHAR(50),"+
					 "PRIMARY KEY (`id`)"+
					 ");";
		dao.insert(createHospitalTable);
		
		String createPatientTable = "CREATE TABLE `jdbcshema`.`patient_viajdbc` ( "+
				 "`id` INT NOT NULL,  "+
				 "`name` VARCHAR(50), "+
				 "`hospital_id` INT,  "+
				 "PRIMARY KEY (`id`), "+
				 "CONSTRAINT `FK_OneToOneicin01` FOREIGN KEY (`hospital_id`) REFERENCES  `jdbcshema`.`hospital_viajdbc` (`id`)"+
				 ");";
       	dao.insert(createPatientTable);
       	
       	String createDoctorTable = "CREATE TABLE `jdbcshema`.`doctor_viajdbc` ( "+
				 "`id` INT NOT NULL,  "+
				 "`name` VARCHAR(50), "+
				 "PRIMARY KEY (`id`) "+
				 ");";
       	dao.insert(createDoctorTable);
       
	    String createHospital_PatientTable = "CREATE TABLE `jdbcshema`.`hospital_patient` ( "+
	    		"`hospital_id` INT NOT NULL,   "+
	       		"`patient_id` INT NOT NULL,   "+
	       		"CONSTRAINT `FK_UniqueKey` unique (`patient_id`),  "+
	       		"CONSTRAINT `FK_OneToMany01` FOREIGN KEY (`hospital_id`) REFERENCES  `jdbcshema`.`hospital_viajdbc` (`id`),  "+
	       		"CONSTRAINT `FK_OneToMany02` FOREIGN KEY (`patient_id`) REFERENCES  `jdbcshema`.`patient_viajdbc` (`id`)  "+
	       		");";
	   dao.insert(createHospital_PatientTable);
       	
	   String createDoctor_PatientTable = "CREATE TABLE `jdbcshema`.`doctor_patient` ( "+
	    		"`doctor_id` INT NOT NULL,   "+
	       		"`patient_id` INT NOT NULL,   "+
	       		"CONSTRAINT `FK_ManyToMany01` FOREIGN KEY (`doctor_id`) REFERENCES  `jdbcshema`.`doctor_viajdbc` (`id`),  "+
	       		"CONSTRAINT `FK_ManyToMany02` FOREIGN KEY (`patient_id`) REFERENCES  `jdbcshema`.`patient_viajdbc` (`id`)  "+
	       		");";
	   dao.insert(createDoctor_PatientTable);
	   
	   
	   
	   
	   
       	
	}
}
