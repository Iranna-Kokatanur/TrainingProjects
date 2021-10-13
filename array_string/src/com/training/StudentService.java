package com.training;

public class StudentService {
private Student[] studList;
    
    private static int maxSize =3;
    private static int count = 0;
    

 

    public StudentService(Student[] studList) {
        super();
        this.studList = studList;
    }
    
    public StudentService( ) {
        super();
        this.studList = new Student[maxSize];
    }
    
    public boolean addStudent(Student student) {
    	if(count<maxSize) {
        this.studList[count] = student;
        count++;
        return true;
    	}
    	System.out.println("Array is full ");
    	return false;
    }
    
    public Student[] getStudList() {
        return this.studList;
    }
    

}
