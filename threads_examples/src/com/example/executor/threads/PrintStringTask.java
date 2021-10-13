package com.example.executor.threads;

public class PrintStringTask implements Runnable {
	
	private String str1,str2;
	
	

	public PrintStringTask(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		/*THE FOLLOWING LINES ARE COMMENTED BECAUSE WE ARE USING EXECUTABLE FRAMEWORK.
		 * 
		 * in executable framework, thread pools are created just we have to submit the task.
		 */
		
//		Thread thread = new Thread(this); //Runnable run =new PrintStringTask(str1,str2)
//		thread.start();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintStrings.print(str1, str2);
		
	}

}
