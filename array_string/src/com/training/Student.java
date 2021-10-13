package com.training;

//ckage com.training;

public class Student {
	
	private int roll_number;
	protected double mark_scored;
	public String email;
	public Student() {
		super();
	}
    public Student(int roll_number, double mark_scored, String email, String student_name) {
		super();
		this.roll_number = roll_number;
		this.mark_scored = mark_scored;
		this.email = email;
		this.student_name = student_name;
	}
	String student_name;
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public double getMark_scored() {
		return mark_scored;
	}
	public void setMark_scored(double mark_scored) {
		this.mark_scored = mark_scored;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

}