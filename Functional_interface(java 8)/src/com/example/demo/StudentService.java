package com.example.demo;

import com.training.entity.*;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StudentService {
	
	private List<Student> studentList;

	public StudentService() {
		super();
		
		this.studentList = new ArrayList<>();
		this.studentList.add(new Student(202,"Anand",LocalDate.of(1997, 5, 2),78));
		this.studentList.add(new Student(302,"Anil",LocalDate.of(1997, 6, 2),88));
		this.studentList.add(new Student(402,"Akash",LocalDate.of(1997, 7, 2),58));
		this.studentList.add(new Student(502,"Amar",LocalDate.of(1997, 8, 2),68));
		this.studentList.add(new Student(602,"Anthony",LocalDate.of(1997, 9, 2),82));
		
		
	}
	
	public List<Student> useFilter(){
		
		return this.studentList.stream().filter(e-> e.getMarkScored()>70).collect(Collectors.toList());
	}
	
    public List<Student> useFilter(Predicate<Student> predicate){
		
		return this.studentList.stream().filter(predicate).collect(Collectors.toList());
	}
    
    public Map<String,Double> transformToMap(){
    	
    	return this.studentList.stream()
    			.filter(e-> e.getMarkScored()>70).
    			collect(Collectors.toMap(Student::getStudentName, Student::getMarkScored));
    	
    }
    
    public List<String> getStudentNames(){
    	
    	return this.studentList.stream()
    			.filter(e-> e.getMarkScored()>70)
    			.map(e->e.getStudentName())
    			.collect(Collectors.toList());
    	
    	
    }
    
    public Set<Student> sortedByName(){
    	
    	 TreeSet<Student>list=this.studentList.stream()
    			 .sorted()
    			 .collect(Collectors.toCollection(TreeSet::new));
//    	 this.studentList.stream()
//		 .sorted(Comparator.comparing(Student::getStudentName))
//		 .collect(Collectors.toList());
    	 
    	 
    	 return list;
    	
    }
    
    public double highestMark() {
    	
    	Optional<Student>value=this.studentList.stream().max(Comparator.comparing(Student::getMarkScored));
    	
    	double max=(value.isPresent())?value.get().getMarkScored():0;
    	
    	return max;
    	
    	
    	
    }
	

}
