package com.JDBC;

import com.JDBC.dao.JDBCExample;
import com.JDBC.model.Student;

public class MainExample {

	public static void main(String[] args) {

		JDBCExample jdbc = new JDBCExample();
		Student s = new Student(0, "sivesai", 90);

		System.out.println("----- INSERT -----");
		jdbc.insert(s);

		System.out.println("----- STUDENT RECORDS -----");
		jdbc.select();
	}
}