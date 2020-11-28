package com.cg.training.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.service.CalculateSquare;

public class ExThreeDemo {
	
	private static Scanner sc=new Scanner(System.in);
	
	private static Map<Integer,Integer> listOfSquares;
	
	static {
		listOfSquares=new HashMap<>();
	}

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
		
		
		listOfSquares=CalculateSquare.getSquare(num);
		
		for (Map.Entry <Integer,Integer>entry : listOfSquares.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
		
//		productList.stream().forEach(System.out::println);
//		listOfSquares.
	}

}
