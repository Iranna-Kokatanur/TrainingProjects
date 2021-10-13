package com.training;

public class while_dowhile_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++) {
			System.out.println("inside for loop");
		}
		
		int j=10;
		
		do {
			System.out.println("Inside do-while loop");
			j--;
	    }while(j>=5);
		
		boolean flag=true;
		
		int k=10;
		
		while(flag) {
			System.out.println("Inside while loop");
			
			k++;
			
			if(k==15) {
				flag=false;
			}
			
		}
		
		
	}

}
