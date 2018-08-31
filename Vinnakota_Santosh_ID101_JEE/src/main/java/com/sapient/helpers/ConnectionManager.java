package com.sapient.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	static Connection conn;
	
	public static Connection getConnection() {
		try {
			System.out.println("Getting a connection....");
			String DB_URL = "jdbc:mysql://localhost:3606/student";
			String USER = "root";
			String PASS = "rootroot";
			
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
			} catch(SQLException se) {
				se.printStackTrace();
			}
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		return conn;
	}
}
