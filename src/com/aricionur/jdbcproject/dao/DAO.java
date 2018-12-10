package com.aricionur.jdbcproject.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aricionur.jdbcproject.entity.*;

public class DAO extends ADao{

//		ADao aDao ;
//		public DAO(ADao aDao){
//			this.aDao = aDao;
//		}
		 
		public List<Object> read(){
			return null;
		}
	
	
	/*
		public List<Hospital> read(String SQL) {
			List<Hospital> hospitalList = new ArrayList<>();
			Connection con =  createCon();
			Statement statement = null;
			try {
				statement = con.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ResultSet rs = null;
			try {
				rs =  statement.executeQuery(SQL);
				while(rs.next()){
					int id = rs.getInt("id");
					String name = rs.getString("name");
					Hospital hospital = new Hospital(id, name);
					hospitalList.add(hospital);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return hospitalList;
		}
		
*/
	public void insert(String SQL){
			execute(SQL);
		}
	/*	
	public List<Ogrenci> read(String SQL) {
		List<Ogrenci> ogreciList = new ArrayList<>();
		Connection con =  createCon();
		Statement statement = null;
		try {
			statement = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs =  statement.executeQuery(SQL);
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Ogrenci ogrenci = new Ogrenci(id, name);
				ogreciList.add(ogrenci);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return ogreciList;
	}
	

public void insert(String SQL){
		execute(SQL);
	}
*/
		
		
/*		
		public void update(String SQL) {
			exacute(SQL);
		}
		
		public void delete(String SQL) {
			exacute(SQL);
		}
		public void create(String SQL) {
			exacute(SQL);
		}
*/		
		private boolean execute(String SQL){
			Connection con =  createCon();
			Statement statement = null;
			boolean control = false;
			try {
				statement = con.createStatement();
				control = statement.execute(SQL);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			return control;
		}

}
