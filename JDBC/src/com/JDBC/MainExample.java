package com.JDBC;

import com.JDBC.dao.JDBCExample;

public class MainExample {

	public static void main(String[] args) {

		JDBCExample jdbc = new JDBCExample();

		System.out.println("----- INSERT -----");
		jdbc.insert("rupesh", 99);

		System.out.println("----- STUDENT RECORDS -----");
		jdbc.select();
	}
}