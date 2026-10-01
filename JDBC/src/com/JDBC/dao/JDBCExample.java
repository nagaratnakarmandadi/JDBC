package com.JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.JDBC.utility.DBConnection;

public class JDBCExample implements JDBCExampleInterface {

	@Override
	public void insert(String name, int marks) {

		try {
			DBConnection db = new DBConnection();
			Connection con = db.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into student(sname, smarks) values(?, ?)");

			ps.setString(1, name);
			ps.setInt(2, marks);

			int n = ps.executeUpdate();

			if (n > 0) {
				System.out.println(n + " row affected");
			} else {
				System.out.println("Something went wrong");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void select() {

		try {
			DBConnection db = new DBConnection();
			Connection con = db.getConnection();

			PreparedStatement ps = con.prepareStatement("select * from student");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("sno") + " : " + rs.getString("sname") + " : " + rs.getInt("smarks"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}