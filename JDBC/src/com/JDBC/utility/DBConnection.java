package com.JDBC.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private Connection con;

	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Connection getConnection() {
		return con;
	}
}