package com.cg.training.service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimerTask;

public class TimerTask1 extends TimerTask implements Runnable{
	private String name;
	   public TimerTask1(String name) {
	       this.name = name;
	   }
	   public void run() {
	      System.out.println("[" + LocalDateTime.now() + "] " + name + ": task executed!");
	   }

	
}
