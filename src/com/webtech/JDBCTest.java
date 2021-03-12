package com.webtech;

import java.sql.*;
import java.util.*;

public class JDBCTest {

	public static void main(String a[]) {

		// Entering the data
		Scanner k = new Scanner(System.in);
		System.out.println("enter name");
		String name = k.next();
		System.out.println("enter roll no");
		int roll = k.nextInt();
		System.out.println("enter class");
		String cls = k.next();

		// Inserting data using SQL query
		String sql = "insert into student1 values('" + name + "'," + roll + ",'" + cls + "')";
		Connection conn = null;
		try {
			conn = CloudDatabaseConnection.initializeDatabase();

			Statement st = conn.createStatement();
			int m = st.executeUpdate(sql);
			if (m == 1)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}

}
