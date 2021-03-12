package com.webtech;

/**
 * 
 */
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

// This class can be used to initialize the database connection 
public class CloudDatabaseConnection { 
	protected static Connection initializeDatabase() 
		throws SQLException, ClassNotFoundException 
	{ 
		String dbDriver = "com.mysql.cj.jdbc.Driver"; 
		Class.forName(dbDriver); 
		String url ="jdbc:mysql://webtech-mysql.mysql.database.azure.com:3306/students?useSSL=true&requireSSL=false"; 
		Connection con = DriverManager.getConnection(url, "webtechadmin@webtech-mysql", "Webtech@01");
		
		return con; 
	} 
}
