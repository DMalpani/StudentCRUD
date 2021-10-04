
package com.Configuration;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBConnect4 
	{
		private static String url = "jdbc:mysql://localhost:3306/student";
		private static String user = "root";
		private static String password = "Miss.malpani92";
		
		public static Connection getConnection()
		{
			Connection con = null;
			try
			{
				con = DriverManager.getConnection(url, user, password) ;	
			}
			
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			return con;
		}
	}


