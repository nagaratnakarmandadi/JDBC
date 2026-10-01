package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into student(sname,smarks) values(?,?)");
			ps.setString(1, "chandu");
			ps.setInt(2, 69);
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + " row affected  ");
			} else {
				System.out.println("some thing went wrong");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
