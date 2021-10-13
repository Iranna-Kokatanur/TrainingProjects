package com.training;

import com.training.ifaces.Ifunction;

public class TempConverter implements Ifunction {

	@Override
	public double apply(double arg) {
		// TODO Auto-generated method stub
		return (5.0/9.0)*(arg-32);
	}

}
