package com.aricionur.jdbcproject.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aricionur.jdbcproject.entity.Doctor;
import com.aricionur.jdbcproject.entity.Hospital;
import com.aricionur.jdbcproject.entity.Patient;

public class DoctorDAO extends ADao {
	
	String SQL = "SELECT * FROM doctor_viajdbc";
	
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
				
				Doctor doctor = new Doctor(id, name);
				objectList.add((Object) doctor);
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
