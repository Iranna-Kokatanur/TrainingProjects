package com.example.demo;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger log = Logger.getRootLogger();
        
        
        
        System.out.println("Enter the number");
        
       
        
        try(Scanner sc = new Scanner(System.in);) {
        	
        	 double number = sc.nextDouble();
             
             log.info("You entered number: "+number);
        	
        	if(number<0) {
        		log.error("number should be positive integer");
        		
        		throw new Exception("Invalid Number");
        	}
        	
        	double result = Math.sqrt(number);
            
            log.info("Completed Square Root:="+result);
			
		} catch (Exception e) {
			
			log.debug(e.getMessage());
			
			e.printStackTrace();
			
		}
        
        
        
        
        
    }
}
