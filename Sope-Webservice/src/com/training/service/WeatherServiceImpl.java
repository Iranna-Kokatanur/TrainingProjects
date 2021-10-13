package com.training.service;

import javax.jws.WebService;

import com.training.ifaces.WebServices;


@WebService(endpointInterface = "com.training.ifaces.WebServices")
public class WeatherServiceImpl implements WebServices {

	
	@Override
	public String getWeather(String city) {
		
		String currentWeather = "29C -HAZE";
		if(city.equals("CHN"))
			currentWeather =  "32 C -SUNNY";
		
		return currentWeather;
	}

}
