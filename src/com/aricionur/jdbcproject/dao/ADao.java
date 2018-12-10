package com.aricionur.jdbcproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public abstract class ADao {

	public final String URL = "jdbc:mysql://localhost:3306/jdbcshema?serverTimezone=Turkey";

	public final String userName = "root";

	public final String password = "1234";

	public Connection createCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, userName, password);

			if (con != null)
				System.out.println("baglandi");
		} catch (Exception e) {
				System.out.println("baglanamadi");
			e.printStackTrace();
		}
		return con;
	}
	
	public abstract List<Object> read();
}
