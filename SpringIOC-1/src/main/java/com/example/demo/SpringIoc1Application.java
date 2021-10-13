package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import org.training.entity.OrderBook;

//import com.example.demo.entity.Invoice;

@SpringBootApplication
public class SpringIoc1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringIoc1Application.class, args);
		
		
		StudentService service= ctx.getBean(StudentService.class);
		
		
		
		List<Student>list=service.getStudentList();
		
		list.forEach(System.out::println);
		
		
		
		System.out.println("----------------------------------");
		
		System.out.println("Is Singleton:=>"+ctx.isSingleton("studentService"));
		
//		System.out.println("Is Singleton:=>"+ctx.isSingleton("SS"));
		
		System.out.println("----------------------------------");
//		Student ser= service.getStud();
//		
//		System.out.println(ser);
		
		
		
	}

}
