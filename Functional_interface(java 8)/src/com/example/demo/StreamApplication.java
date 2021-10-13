package com.example.demo;

import com.training.entity.*;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class StreamApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService service = new StudentService();
		
		List<Student>markSeventyAbove=service.useFilter();
		
		System.out.println("Seventy and above");
		
		markSeventyAbove.forEach(System.out::println);
		
		Predicate<Student>lessThanSeventy = e->e.getMarkScored()<70;
		
		Predicate<Student>greaterThanEighty = e->e.getMarkScored()>80;
		
		System.out.println("less Than Seventy");
		
		service.useFilter(lessThanSeventy).forEach(System.out::println);
		
		System.out.println("greater Than Eighty");
		
		service.useFilter(greaterThanEighty).forEach(System.out::println);
		
		service.getStudentNames().forEach(System.out::println);
		
		service.transformToMap().forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("Highest mark: "+service.highestMark());
		
		System.out.println("sorted by name");
		
		service.sortedByName().forEach(System.out::println);
		

	}

}
