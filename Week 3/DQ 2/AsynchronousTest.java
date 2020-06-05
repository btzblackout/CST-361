package com.blackout;


public class AsynchronousTest {

	public static void main(String[] args) 
	{
		//Create a new thread.
		Thread FirstThread = new Thread(() -> {
			try {
				//Waits 3 seconds
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This is the first thread.");
		});
		
		//Create a second thread
		Thread SecondThread = new Thread(() -> {
			try {
				//Waits 5 seconds
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This is the second thread.");
		}); 
		
		//Create a third thread
		Thread ThirdThread = new Thread(() -> {
			try {
				//Wait 1 second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This is the third thread.");
		}); 
		
		
		//Call threads
		FirstThread.start();
		SecondThread.start();
		ThirdThread.start();
		//Since this is at the end of the file, you would think it would execute last. 
		System.out.println("This should execute last?");
	}
		/*Outputs
	This should execute last?
	This is the third thread.
	This is the first thread.
	This is the second thread.*/


}
