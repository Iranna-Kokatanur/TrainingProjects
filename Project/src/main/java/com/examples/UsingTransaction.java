package com.examples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Savepoint;

import com.examples.demo.utils.DbConnection;

public class UsingTransaction {

	public static void main(String[] args) {


		Connection con = DbConnection.getOracleConnection();
		
		try {
			con.setAutoCommit(false);
			String sql = "insert into student(rollNumber,studentName,markScored)"+
			              "values(201,'tom',56)";
			PreparedStatement psmt = con.prepareStatement(sql);
			
			 int rowsAdded=psmt.executeUpdate();
			 
//			 Savepoint s1 = con.setSavepoint("s1");
//			 
//			 String sql1 = "insert into student(rollNumber,studentName,markScored)"+
//		              "values(201,'tom',56)";
//		 PreparedStatement psmt1 = con.prepareStatement(sql1);
//		
//		 psmt1.executeUpdate();
//		 
//		 Savepoint  s2= con.setSavepoint("s2");
//		 
//		 con.rollback(s1);
			
			System.out.println(rowsAdded+" done");
			
			con.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
