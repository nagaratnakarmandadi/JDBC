package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			Statement st= con.createStatement();
			int n =st.executeUpdate("insert into student (sname,smarks) values ('teja',90)");
			if (n>0) {
				System.out.println(n + " row affected  ");
			}
			else {
				System.out.println("some thing went wrong");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
