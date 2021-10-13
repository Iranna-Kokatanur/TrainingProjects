package com.training.model;

import java.util.Objects;

//ckage com.training;

public class Student implements Comparable<Student> {
	
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
	@Override
	public int hashCode() {
		return Objects.hash(email, mark_scored, roll_number, student_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email)
				&& Double.doubleToLongBits(mark_scored) == Double.doubleToLongBits(other.mark_scored)
				&& roll_number == other.roll_number && Objects.equals(student_name, other.student_name);
	}
	@Override
	public int compareTo(Student o) {
		
		return (this.roll_number>o.roll_number)?1:-1;
		
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", mark_scored=" + mark_scored + ", email=" + email
				+ ", student_name=" + student_name + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}