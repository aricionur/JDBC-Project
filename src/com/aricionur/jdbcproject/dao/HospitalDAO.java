package com.aricionur.jdbcproject.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aricionur.jdbcproject.entity.Hospital;

public class HospitalDAO extends ADao {
	
	String SQL = "SELECT * FROM hospital_viajdbc";
	
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
				Hospital hospital = new Hospital(id, name);		
				objectList.add((Object) hospital);
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
