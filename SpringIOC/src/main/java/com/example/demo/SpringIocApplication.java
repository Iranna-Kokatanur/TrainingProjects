package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.training.entity.OrderBook;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Invoice;
import com.example.entity.Customer;

import com.example.entity.Product;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = {"com.example.demo","org.training.entity"})
@Slf4j
public class SpringIocApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringIocApplication.class, args);
		
		System.out.println(ctx);
		
//		Customer customer=ctx.getBean(Customer.class);
//		
//		log.info(customer.toString());
//		

		Product product=ctx.getBean("samsung",Product.class);
		
		log.info(product.toString());
		
		Invoice invoice = ctx.getBean("ramsInvoice",Invoice.class);
		
		log.info(invoice.toString());
		
        Bill bill = ctx.getBean(Bill.class);
		
		log.info(bill.toString());
		
		OrderBook order = ctx.getBean(OrderBook.class);
			
		log.info(order.toString());
		
		List<Invoice>list=order.getInvoiceList();
		
		list.forEach(System.out::println);
		
		
        Customer customer1=ctx.getBean("shyam",Customer.class);
		
		log.info(customer1.toString()); 
		
		list.forEach(System.out::println);
		
		ctx.close();
	}

}
