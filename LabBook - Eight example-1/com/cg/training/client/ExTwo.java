package com.cg.training.client;

import java.util.Timer;

import com.cg.training.service.TimerTask1;

public class ExTwo {

	public static void main(String[] args) 
	{
		
		TimerTask1 t1 = new TimerTask1("Task 1");
		
	      Timer t = new Timer();
	      t.schedule(t1, 10000); //  executes for every 10 seconds
//	      t.schedule(t1, 90000, 10000);
	      
	      System.out.println("thread: "+Thread.currentThread());

	}

}
