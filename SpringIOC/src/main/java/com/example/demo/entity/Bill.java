package com.example.demo.entity;

import com.example.entity.Customer;
import com.example.entity.Product;

import lombok.*;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
	
	private Product product;
	private Customer customer;

}
