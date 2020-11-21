/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cg.training.client;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ExampleTwoTester {
    	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		StringBuffer r=getImage(s);
		System.out.println("Final string:"+s+"|"+r);
	}
	public static StringBuffer getImage(String s)
	{
		StringBuffer userInput=new StringBuffer(s).reverse();
		//System.out.println(s);
		//System.out.println(userInput.toString());
		return userInput;

        }
}