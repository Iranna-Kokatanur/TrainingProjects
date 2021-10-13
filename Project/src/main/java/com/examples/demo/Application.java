package com.examples.demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.naming.NameNotFoundException;

import org.apache.log4j.Logger;

import com.examples.demo.utils.DbConnection;
import com.training.daos.EmployeeDataImpl;
import com.training.entity.Employee;
import com.training.ifaces.CrudRepository;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;





public class Application {
	
	public static void print() {
		
		 System.out.println("\n1: Add method");
		 System.out.println("2: The Details of Employees By Their Names");
		 System.out.println("3: Update or Add Method");
		 System.out.println("4: The employee details by their Birthdate");
		 System.out.println("5: The employee details by their Wedding date");
		 System.out.println("6: The Details Of The All Employees Are (FirstName and LastName)");
		 System.out.println("7: Employee details by their Id");
		 System.out.println("8: Remove Method by Emp Id");
		 System.out.println("9: Exit\n");
		 
		
	}

	public static void main(String[] args) {
		Logger log = Logger.getRootLogger();
		
		
		
		Connection con = DbConnection.getOracleConnection();
		System.out.println(con);
		int key;
		CrudRepository<Employee,Integer>repo = new EmployeeDataImpl(con);
		boolean status=true;
		 int empId = 0;
	     String firstName=null;
	     String lastName = null;
	     String address=null;
	     String email=null;
	     Long phoneNumber=null;
	     LocalDate dateOfBirth = null;
	     LocalDate weddingAnniversary = null;
	     int year=0;
	     int month=0;
	     int day=0;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the status to continue..");
	     status=sc.nextBoolean();
	     while(status) {
	    	print();
	    	System.out.println("Enter key Greater than one to Continue....");
	    	key=sc.nextInt();
	    	if(key<1) {
	    		log.error("Key should be positive integer");
	    		break;
	    	}
	    if(key==1 || key==3) {
	    	 
	    	 System.out.println("Enter the empId");
			 empId=sc.nextInt();
			 System.out.println("Enter first name");
			 firstName=sc.next();
			 System.out.println("Enter Last name");
			 lastName=sc.next();
			 System.out.println("Enter phone number");
			 String c= sc.next();
			 while(c.length()!=10) {
				 System.out.println("Enter the correct phone number");
				 c= sc.next();
			 }
			 phoneNumber=Long.parseLong(c);
			 System.out.println("Enter the address");
			 address=sc.next();
			 System.out.println("Enter the Email");
			 email=sc.next();
			 System.out.println("Enter Date of Birth");
			 System.out.println("Enter The Year");
			 year=sc.nextInt();
			 System.out.println("Enter The Month");
			 month=sc.nextInt();
			 System.out.println("Enter The Day");
			 day = sc.nextInt();
			 dateOfBirth= LocalDate.of(year, month, day);
			 System.out.println("Enter The Date of Marriage");
			 System.out.println("Enter The Year");
			 year=sc.nextInt();
			 System.out.println("Enter The Month");
			 month=sc.nextInt();
			 System.out.println("Enter The Day");
			 day = sc.nextInt();
			 weddingAnniversary=LocalDate.of(year, month, day);
	    	
	    }
		
		switch (key) {
		case 1:
			Employee emp1=new Employee( empId, firstName,lastName, address,  email, phoneNumber,
		    dateOfBirth, weddingAnniversary);
		    boolean result=repo.add(emp1);
		    if(result) {
		     log.info("1 Student row Added");
			}
			break;
		
		case 2:
			
			List<Employee> list=null;
			System.out.println("Enter first name");
			firstName=sc.next();
			System.out.println("Enter Last name");
			lastName=sc.next();
			try {
				list = repo.findByName(firstName, lastName);
			} catch (NameNotFoundException e1) {
				
				e1.printStackTrace();
			}
			list.forEach((e)->System.out.println(e));
			
			break;
			
		case 3:
			
			Employee emp=new Employee( empId, firstName,lastName, address,  email, phoneNumber,
			dateOfBirth, weddingAnniversary);
		    int count=repo.updateOrAdd(emp);
		    if(count==0) {
			 log.info("1 row Added");
		     }
		    else {
			 log.info("1 row updated");
		    }
		    break;
		
		case 4:
			int c=0;
			
			 System.out.println("Enter The Date.......\n");
			 System.out.println("Enter The Year");
			 year=sc.nextInt();
			 System.out.println("Enter The Month");
			 month=sc.nextInt();
			 System.out.println("Enter The Day");
			 day = sc.nextInt();
			 dateOfBirth= LocalDate.of(year, month, day);
			 List<Employee>list1=repo.findByBirthDate(dateOfBirth);
			 if(list1.size()==0) {
				 log.info("No Data Found");
			 }
			 else {
			 System.out.println("The list of employees with their name and email_id whose Birthday falls on the given date are \n");

			 for(Employee e:list1) {
			
				 Period period=Period.between(dateOfBirth, e.getDateOfBirth());
				if(period.getYears()<=0) {
					 System.out.println(e.getNameAndMail());
					 if(period.getYears()==0) {
						 System.out.println("WISHING YOU HAPPY BIRTHDAY");
					 }
					 else {
					 System.out.println("WISHING YOU HAPPY BIRTHDAY FOR "+Math.abs(period.getYears())+" TH BIRTHDAY");
					 }
					 System.out.println();
					 c++;
				}
			  }
			 }
			 if(c==0 && list1.size()!=0) {
				 System.out.println("You Have Entered The Date Before The Birthday of Employee Who Are In The Database");
			 }
			break;
			
		case 5:
			 int c1=0;
			 
			 System.out.println("Enter The Date.....\n");
			 System.out.println("Enter The Year");
			 year=sc.nextInt();
			 System.out.println("Enter The Month");
			 month=sc.nextInt();
			 System.out.println("Enter The Day");
			 day = sc.nextInt();
			 weddingAnniversary=LocalDate.of(year, month, day);
			 List<Employee>list2=repo.findByWeddingDate(weddingAnniversary);
			 if(list2.size()==0) {
				
				log.info("No Data Found");
				 
			 }
			 else {
			 System.out.println("List of employee with their name and phone Number whose Wedding Anniversary falls on the given date are\n");
			 for(Employee e:list2) {
					
				 Period period=Period.between(weddingAnniversary, e.getWeddingAnniversary());
				if(period.getYears()<=0) {
					 System.out.println(e.getNameAndPhoneNumber());
					 if(period.getYears()==0) {
						 System.out.println("WISHING YOU HAPPY ANNIVERSARY");
					 }
					 else {
					 System.out.println("WISHING YOU HAPPY ANNIVERSARY FOR "+Math.abs(period.getYears())+" TH WEDDING ANNIVERSARY");
					 }
					 System.out.println();
					 c1++;
				}
			  }
			 }
			 if(c1==0 && list2.size()!=0) {
				 System.out.println("You Have Entered The Date Before The Wedding date of Employee Who Are In The Database");
			 }
			 break;
			
		case 6:
			
			List<Employee>list3=repo.findAll();
			if(list3.size()==0) {
				
				log.info("No Data Found");
				 
			 }
			else {
			list3.forEach((e)->System.out.println(e.getNames()));
			}
			break;
			
			
		case 7:
			
			System.out.println("Enter the empId");
			empId=sc.nextInt();
			Employee emp2=repo.findById(empId);
			if(emp2==null) {
				log.info("No Data Found");
			}
			else {
			System.out.println(emp2);
			}
			break;
			
		case 8:
			
			System.out.println("Enter the empId");
			empId=sc.nextInt();
			boolean result1 = repo.remove(empId);
			if(result1) {
				log.info("1 row deleted");
			}
			else {
				log.info("Employee Not Found In The Employee Database");
			}
			break;
		default:
			break;
		}
		System.out.println("\n\n");
		System.out.println("Enter the status to continue..");
		status=sc.nextBoolean();
	  }
	sc.close();	
	}
	 
}
		

	


