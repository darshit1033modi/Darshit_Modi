package com.darshit.k2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			Class.forName(AppConstatnts.DRIVER_CLASS);
			con = DriverManager.getConnection(AppConstatnts.URL, AppConstatnts.USER, AppConstatnts.PASSWORD);	
			return con;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
