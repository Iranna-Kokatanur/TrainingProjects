package com.example.demo;

public class StudentService {
	
	public String assignGrade(Student student) {
		
		String grade="A";
		
		if(student.getMark_scored()>80){
			grade="o";
		}
		return grade;
		
	}
	
	public String assignGrade(Student student,String category) {
		
		
		String grade="A";
		if(category.equals("Urban")) {
			
			
			if(student.getMark_scored()>80){
				grade="o";
			}
		}
			else {
				if(student.getMark_scored()>70){
					grade="o";
				}
			}
		return grade;
	}
	
	
	

}
