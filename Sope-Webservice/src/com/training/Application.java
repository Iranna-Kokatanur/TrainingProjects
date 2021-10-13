package com.training;

import javax.xml.ws.Endpoint;

import com.training.service.WeatherServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		Endpoint ep = Endpoint.publish("http://localhost:5050/Weather", new WeatherServiceImpl());
		
		System.out.println("Service Published");
	}

}
