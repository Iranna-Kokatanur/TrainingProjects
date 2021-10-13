package com.example.demo;

public class UnderStandingDefault implements Condition,Validator {

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		
		/*If the method is implemented in two or more interfaces.
		 * then call one or both interface in overriden method.
		 * or implement new functionality
		 * 
		 */
		return Condition.super.show();
//		return Validator.super.show();
//		return Condition.super.show()+" "+Validator.super.show();
	}

	

}


