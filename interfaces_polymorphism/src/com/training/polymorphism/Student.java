package com.training.polymorphism;

import java.io.Serializable;

import com.training.ifaces.Condition;

/*
 * marker interface - Interface that does not have any method
 * function interface - interface that just has one abstract method
 * interface - with more than one abstract methods
 */

public class Student implements Condition,Serializable {

	
	private double markScored;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(double markScored) {
		super();
		this.markScored = markScored;
	}


	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.markScored>80;
	}

}
