package com.cg.training.client;


import java.util.Scanner;

import com.cg.training.service.SecondSmallestElement;

public class ExFifthDemo {
	
	private static Scanner sc=new Scanner(System.in);

	
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println("enter the size");
		int size= sc.nextInt();
		
		Integer [] num= new Integer[size];
		System.out.println("enter the elements");
		
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		
		
		
		System.out.println(SecondSmallestElement.getSecondSmallest(num));
		
	}

}
