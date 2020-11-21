/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.client;

import com.cg.training.service.Account;
import com.cg.training.service.CurrentAccount;
import com.cg.training.service.SavingAccount;

/**
 *
 * @author LENOVO
 */
public class AccountTester {
    public static void main(String[] args) {
		
		Account A = new Account("Smith",30,45756987,2000);
		System.out.println(A);
		Account B = new Account("Kathy",35,45896988,3000);
		System.out.println(B);
		A.deposit(2000);
		System.out.println(A);
		B.withdraw(2000);
		System.out.println(B);
		
		SavingAccount savAcc = new SavingAccount("komal", 22, 789845, 5000);
		System.out.println(savAcc);
		
		savAcc.withdraw(4001);
		System.out.println(savAcc);
		
		CurrentAccount curAcc = new CurrentAccount("komal", 22, 789845, 5000,2000);
		System.out.println(curAcc);
		
		curAcc.withdraw(7002);
		System.out.println(curAcc);
		
}
