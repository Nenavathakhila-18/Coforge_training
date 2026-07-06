package com.cofoge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcUpdateTest {

	public static void main(String[] args) throws Exception {

		// step 1 : loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2 : connection with db
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root",
				"Akhila@180305");

		// step 3 : creating statement
		String sql = "UPDATE tbl_emp SET ename = ?, esal = ? WHERE eid = ?";
		PreparedStatement statement = connection.prepareStatement(sql);

		// step 4 : Executing the query
		
		statement.setString(1, "Rahul"); // Employee name
		statement.setInt(2, 45000);      // Salary
		statement.setInt(3, 202);        // Employee ID
		
		int n = statement.executeUpdate(); // method for INSERT, DELETE , UPADATE
		if(n == 1) {
			System.out.println("Employee details updated");
		} else {
			System.out.println("Employee details not updated");
		}
		

		// step 5 : closing
		statement.close();
		connection.close();

	}

}



