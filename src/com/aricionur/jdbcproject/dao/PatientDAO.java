package com.aricionur.jdbcproject.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aricionur.jdbcproject.entity.Hospital;
import com.aricionur.jdbcproject.entity.Patient;

public class PatientDAO extends ADao {
	
	String SQL = "SELECT * FROM patient_viajdbc";
	
//	public HospitalDAO(String sql) {
//	this.SQL = sql;
//	}
	
	@Override
	public List<Object> read() {
		List<Object> objectList = new ArrayList<>();
		Connection con = createCon();
		Statement statement = null;
		try {
			statement = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = statement.executeQuery(SQL);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int hospital_id = rs.getInt("hospital_id");
				
				Patient patient = new Patient(id, name, hospital_id);
				objectList.add((Object) patient);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return objectList;

	}
}// EndOfClass
