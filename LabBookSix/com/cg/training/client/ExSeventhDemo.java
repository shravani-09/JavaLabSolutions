package com.cg.training.client;

import java.util.Scanner;

import com.cg.training.service.ReverseNumber;

public class ExSeventhDemo {
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("enter the size");
		int size= sc.nextInt();
		
		int [] num= new int[size];
		System.out.println("enter the elements");
		
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		
		ReverseNumber.getReverseNumberArray(num);
		

	}

}
