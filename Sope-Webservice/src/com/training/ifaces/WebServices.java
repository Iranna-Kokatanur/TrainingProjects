package com.training.ifaces;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface WebServices {
	@WebResult(name = "CurrentCondition")
	public String getWeather(@WebParam(name ="city")String city);

}
