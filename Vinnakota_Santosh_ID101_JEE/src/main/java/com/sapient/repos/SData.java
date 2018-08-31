package com.sapient.repos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sapient.helpers.ConnectionManager;
import com.sapient.models.Student;

public class SData {

	static Connection conn = null;
	static ResultSet rs = null;
	
	public static Student login(Student student) {
		Statement stmt = null;
		String rollno = student.getRollNo();
		String sql = "SELECT * FROM STUDENT WHERE ROLLNO='" + rollno + "'";
		
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			boolean userExist = rs.next();
			
			if(!userExist) {
				student.setValid(false);
			} else if(userExist) {
				int percent = rs.getInt("percent");
				int sc1 = rs.getInt("sc1");
				int sc2 = rs.getInt("sc2");
				int sc3 = rs.getInt("sc3");
				student.setPercent(percent);
				student.setSc1(sc1);
				student.setSc2(sc2);
				student.setSc3(sc3);
				student.setValid(true);
			}
		} catch(SQLException se) {
			se.printStackTrace();
		}
		return student;
		
	}
}
