/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.service;

/**
 *
 * @author LENOVO
 */
public class SavingAccount extends Account {
    public SavingAccount(String name, float age, long accNum, double balance) {
		super(name, age, accNum, balance);
		// TODO Auto-generated constructor stub
	}

	private final double minBalance=1000;

	@Override
	public void withdraw(double bal) {
		
		if((super.getBalance()-bal)<this.minBalance)
			System.out.println("Sorry !! Minimun balance should be INR 1000");
		else
			super.setBalance(super.getBalance()-bal);
	}
	
	

}
