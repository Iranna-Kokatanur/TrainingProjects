package com.example.demo;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.training.entity.Student;

public class BuiltInFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=Arrays.asList("Ramesh","Suresh","Nagesh");
		
		for(String name:names) {
			System.out.println(name);
		}
		
		System.out.println("********************************");
		
		names.forEach(e->System.out.println(e));
		
		System.out.println("********************************");
		
		Consumer<String>print = (e) -> System.out.println(e);
		
		names.forEach(print);
		
		System.out.println("********************************");
		
		Consumer<String>print1 = System.out::println;// passing the reference
		
		names.forEach(print1);
		
		System.out.println("********************************");
		
		Student ram = new Student(101, "Ramesh", LocalDate.now(), 90);
		
		Predicate<Student> result = (obj)-> obj.getMarkScored()>80;
		
		System.out.println("Result: "+result.test(ram));
		
		System.out.println("********************************");
		
		Supplier<String>message = ()->"HAPPY DEWALI !";
		
		System.out.println("Message: "+message.get());
		
		System.out.println("********************************");
		
		Function<String,Integer> func = (arg)-> arg.length();
		
		System.out.println(func.apply(message.get()));
		
		
		
		
		
		
		

	}

}
