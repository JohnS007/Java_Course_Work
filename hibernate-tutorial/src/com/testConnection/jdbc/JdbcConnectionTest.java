package com.testConnection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionTest {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimeZone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("Connecting to : " + jdbcUrl);
			
			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection Successful !!!!!!");

			myConnection.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
