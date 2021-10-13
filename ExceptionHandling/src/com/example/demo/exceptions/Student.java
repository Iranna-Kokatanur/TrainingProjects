package com.example.demo.exceptions;

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
//		this.mark_scored = mark_scored;
		//Here we handled the exception
		try {
			if(mark_scored>0 && mark_scored<=100)
				this.mark_scored = mark_scored;
			else
				throw new RangeCheckException("mark scored between 0 to 99");
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	//The exception which extends exception class= checked exception.For that we need
	//to handle or declare it. And declared using throws keyword and catch the exception or we can use try and catch for handle.
	
	
	//The exception which extend Runtime exception = Unchecked exception. For that 
	//don't need of declaring or handling it.
	
	public void setMark_scored(double mark_scored) throws RangeCheckException {
		if(mark_scored>0 && mark_scored<=100)
			this.mark_scored = mark_scored;
		else
			throw new RangeCheckException("mark scored between 0 to 99");
	}
	public String getEmail() {
		
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("@")) {
			this.email = email;
		}
		else {
			throw new UncheckedException("it is not containing @");
		}
//		this.email = email;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", mark_scored=" + mark_scored + ", email=" + email
				+ ", student_name=" + student_name + "]";
	}
	

}	
