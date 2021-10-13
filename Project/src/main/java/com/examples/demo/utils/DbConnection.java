package com.examples.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {
	
	public static Connection getOracleConnection() {
		
		Connection con = null;
		
		try {	
			String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
			
			con= DriverManager.getConnection(url, "hr", "hr");
			
	 String sql="create table employee (empId number primary key,firstName varchar2(20),lastName varchar2(20),address varchar2(20),email varchar2(20),dateOfBirth date,weddingAnniversary date,phoneNumber number)";
			
			
			Statement stat = con.createStatement();
			
			stat.executeUpdate(sql);
			 
			System.out.println("Employee Table Created..");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
		
	}

}
