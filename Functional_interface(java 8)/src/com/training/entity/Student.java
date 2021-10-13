package com.training.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private int rollNumber;
	private String studentName;
	private LocalDate date;
	private double markScored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentName, LocalDate date, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.date = date;
		this.markScored = markScored;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", date=" + date + ", markScored="
				+ markScored + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getStudentName().compareTo(o.getStudentName());
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, markScored, rollNumber, studentName);
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
		return Objects.equals(date, other.date)
				&& Double.doubleToLongBits(markScored) == Double.doubleToLongBits(other.markScored)
				&& rollNumber == other.rollNumber && Objects.equals(studentName, other.studentName);
	}
	
	
	
	

}
