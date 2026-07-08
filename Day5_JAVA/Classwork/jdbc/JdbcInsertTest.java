package com.cofoge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsertTest {

	public static void main(String[] args) throws Exception {

		// step 1 : loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2 : connection with db
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root",
				"Akhila@180305");

		// step 3 : creating statement
		String sql = "insert into tbl_emp values(?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);

		// step 4 : Executing the query
		statement.setInt(1, 202);
		statement.setString(2, "Vijay");
		statement.setInt(3, 50000);
		statement.setInt(4, 10);
		
		int n = statement.executeUpdate(); // method for INSERT, DELETE , UPADATE
		if(n == 1) {
			System.out.println("Employee details saved");
		} else {
			System.out.println("Employee details not saved");
		}
		

		// step 5 : closing
		statement.close();
		connection.close();

	}

}



