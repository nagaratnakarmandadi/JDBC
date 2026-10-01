package com.JDBC;

public class MainExample {

	public static void main(String[] args) {

		JDBCExample jdbc = new JDBCExample();

		// System.out.println("----- INSERT -----");
		// jdbc.insert();

		System.out.println("----- STUDENT RECORDS -----");
		jdbc.select();
	}
}