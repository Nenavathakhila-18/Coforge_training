package com.cofoge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcSelectTest {

	public static void main(String[] args) throws Exception {

		// step 1 : loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2 : connection with db
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root",
				"Akhila@180305");

		// step 3 : creating statement
		String sql = "select * from tbl_emp";
		PreparedStatement statement = connection.prepareStatement(sql);

		// step 4 : Executing the query
		ResultSet resultset = statement.executeQuery(sql);
		while(resultset.next()) {
			System.out.println(resultset.getInt("eid") + " "
		            + resultset.getString("ename") + " "
		            + resultset.getInt("esal") + " "
		            + resultset.getInt("dno"));
		}
		
		// step 5 : closing
		statement.close();
		connection.close();

	}

}



