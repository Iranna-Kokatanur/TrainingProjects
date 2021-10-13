package com.example.demo;

import java.util.Optional;

public class UnderstandingOptional {
	
	public static String getMessage(int key) {
		
		switch (key) {
		case 1:
			return "Happy Birthday";
		case 2:
			return "Happy Dussehra";
		case 3:
			return "Happy Dewali";
		default:
			return null;
		}
		
	}
	
public static Optional<String> getMessage(char key) {
		
		switch (key) {
		case 'a':
			return Optional.of("Happy Birthday");
		case 'b':
			return Optional.of("Happy Dussehra");
		case 'c':
			return Optional.of("Happy Dewali");
		default:
			return Optional.empty();
		}
		
	}
	
	public static void main(String[] args) {
		
		Optional<String> resp = Optional.ofNullable(getMessage(2));
		
//		if(resp.isPresent()) {
//			System.out.println(resp.get().toUpperCase());
//		}
//		else {
//			System.out.println("Invalid Choice - Check Again");
//		}
		
//		resp.orElseThrow(RuntimeException::new);
		
//		System.out.println(resp.orElseGet(()-> getMessage(2)));
		
		Optional<String> value  = getMessage('a');
		
		if(value.isPresent()) {
			System.out.println(value.get());
		}
	}

}
