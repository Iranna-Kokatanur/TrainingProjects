package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Student {
	
	private int id;
	private String name;
	private double markScored;
	
	public Student(int id, String name, double markScored) {
		super();
		this.id = id;
		this.name = name;
		this.markScored = markScored;
	}
	
	

}
