package com.training.polymorphism;

import com.training.ifaces.Condition;

public class Professor extends Person implements Condition {
	
	private String qualification;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}


	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.qualification.toLowerCase().equals("phd");
	}

}
