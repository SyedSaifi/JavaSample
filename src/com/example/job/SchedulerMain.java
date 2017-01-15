package com.example.job;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SchedulerMain  extends TimerTask{
	Date now; 
	
	public static void main(String args[]) throws InterruptedException {
		SchedulerMain sc = new SchedulerMain();
		sc.runTask();
		
	}
	
	public void runTask(){
		Timer time = new Timer(); // Instantiate Timer Object
		time.schedule(this, 0, 1000); // Create Repetitively task for every 1 secs

		//for demo only.
		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
	}

	@Override
	public void run() {
		now = new Date(); 
		System.out.println("Time is :" + now);
	}
}