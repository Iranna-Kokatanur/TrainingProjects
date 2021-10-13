package com.example.demo;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactiveLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveLearningApplication.class, args);
		
		Flux<String>namePublisher = Flux.just("Ramesh","Suresh","Mahesh");
		
		namePublisher.subscribe(System.out::println);
		
		namePublisher.subscribe(new Subscriber<String>() {

			@Override
			public void onSubscribe(Subscription s) {
				
				s.request(4);
//				System.out.println("On Subscribe called"+s.);
				
			}

			@Override
			public void onNext(String t) {
				
				System.out.println("From On Next "+ t.toString());
				
			}

			@Override
			public void onError(Throwable t) {
				
				System.out.println(t.getMessage());
				
			}

			@Override
			public void onComplete() {
				
				System.out.println("Completed..");
				
			}
		});
	}

}
