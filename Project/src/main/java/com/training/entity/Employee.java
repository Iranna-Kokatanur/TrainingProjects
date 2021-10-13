package com.training.entity;

import java.util.*;
import java.time.LocalDate;

public class Employee {
	
	private int empId;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private Long phoneNumber;
    private LocalDate dateOfBirth;
    private LocalDate weddingAnniversary;
    
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String firstName, String lastName, String address, String email, Long phoneNumber,
			LocalDate dateOfBirth, LocalDate weddingAnniversary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.weddingAnniversary = weddingAnniversary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getWeddingAnniversary() {
		return weddingAnniversary;
	}

	public void setWeddingAnniversary(LocalDate weddingAnniversary) {
		this.weddingAnniversary = weddingAnniversary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", email=" + email + ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth
				+ ", weddingAnniversary=" + weddingAnniversary + "]";
	}
	
	public String getNameAndPhoneNumber(){
		
		return "Employee [firstName=" +firstName+ ", lastName="+lastName+", phoneNumber="+phoneNumber+"]";
		
	}
	
	public String getNames() {
		return "Employee [firstName=" +firstName+ ", lastName="+lastName+"]";
	}
	
	public String getNameAndMail() {
		return "Employee [firstName=" +firstName+ ", lastName="+lastName+", email="+email+"]";
	}
    
	

}
