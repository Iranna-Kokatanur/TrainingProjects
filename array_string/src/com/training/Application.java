package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101,99,"Ramesh","ram@abc.com");
        Student sam = new Student(102,95,"Shyam","sam@abc.com");
        Student yuv = new Student(103,98,"Yuvan","yuv@abc.com");
        Student shrinivas=new Student(104,98,"shrinivas","shi@abc.com");
        StudentService service = new StudentService();
        service.addStudent(yuv);
        service.addStudent(sam);
        service.addStudent(ram);
        service.addStudent(shrinivas);
        
        Student[] list =service.getStudList();
        
        System.out.println(list);
        for(Student eachStudent:list) {
            System.out.println(eachStudent.getStudent_name());
            System.out.println(eachStudent.getMark_scored());
            System.out.println(eachStudent.getEmail());
        }

	}

}
