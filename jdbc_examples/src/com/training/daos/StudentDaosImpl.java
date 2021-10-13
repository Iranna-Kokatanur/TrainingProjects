package com.training.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.training.entity.Student;
import com.training.ifaces.CrudRepository;

public class StudentDaosImpl implements CrudRepository<Student,Integer> {
	
	private ArrayList<Student>list = new ArrayList<>();
	
	private Connection con;

	public StudentDaosImpl(Connection con) {
		super();
		this.con = con;
	}
	
	private int rowAdded;

	
	@Override
	public boolean add(Student t) {
		// TODO Auto-generated method stub
		String sql = "insert into student values(?,?,?,?)";
		
		
		
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			
			psmt.setInt(1, t.getRollNumber());
			psmt.setString(2, t.getStudentName());
			psmt.setDate(3, Date.valueOf(t.getDate()));
			psmt.setDouble(4, t.getMarkScored());
			
			this.rowAdded+=psmt.executeUpdate();
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return (this.rowAdded>0)?true:false;
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		
		ArrayList<Student>list=new ArrayList<>();
		
		String sql = "select * from student";
		
		try(PreparedStatement psmt = con.prepareStatement(sql)) {
			
			ResultSet rs= psmt.executeQuery();
			
			while(rs.next()) {
				
				//the variables of created table
				
				    int rollNumber= rs.getInt("rollNumber");
		            String studentName = rs.getString("studentName");
		            LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
		            double markScored = rs.getDouble("markScored");
		           
		            Student student = new Student(rollNumber, studentName, dateOfBirth, markScored);
		           
		            list.add(student);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return list;
	}
	
	

	@Override
	public int update(Student t) {
		// TODO Auto-generated method stub
		
		int r=0;
		boolean flag=true;
		List<Student>list=findAll(); 
		for(Student s:list) {
			if(s.getRollNumber()==t.getRollNumber()) {
				flag=false;
			}
		}
		

		if(flag) {
			System.out.println("roll number is not present");
			add(t);
		}
		else {
			
			String sql = "update student set studentName=?,markScored=? where rollNumber = ?";
			
	         try(PreparedStatement psmt = con.prepareStatement(sql)){
				
				psmt.setString(1, t.getStudentName());
				psmt.setDouble(2,t.getMarkScored());
				psmt.setInt(3, t.getRollNumber());
//				psmt.setDate(4, Date.valueOf(t.getDate()));
				
				
				r=psmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
		
         return r;
	}

	@Override
	public boolean remove(Student t) {

		String sql = "delete from student where rollNumber = ? ";
		
		int rowDeleted=0;
		
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			
			psmt.setInt(1, t.getRollNumber());
			rowDeleted=psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return (rowDeleted==1)?true:false;
	}

	@Override
	public int rowsAdded() {
		// TODO Auto-generated method stub
		return this.rowAdded;
	}
	
	Student obj=null;

	@Override
	public Student findById(Integer e) {
		
		String sql = "select * from student where rollNumber = ? ";
		
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			ArrayList<Student>list = new ArrayList<>();
			psmt.setInt(1, e);
			ResultSet rs= psmt.executeQuery();
            if(rs.next()) {
				
				//the variables of created table
				
				    int rollNumber= rs.getInt("rollNumber");
		            String studentName = rs.getString("studentName");
		            LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
		            double markScored = rs.getDouble("markScored");
		           
		            obj = new Student(rollNumber, studentName, dateOfBirth, markScored);
		           
		            
				
			}    
			
		}catch(Exception s) {
			s.printStackTrace();
		}
		return obj;
	}

	
	
}
