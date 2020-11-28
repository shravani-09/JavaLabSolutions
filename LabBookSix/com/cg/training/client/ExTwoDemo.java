package com.cg.training.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.service.CharacterCount;

public class ExTwoDemo {
	
	CharacterCount characterCount;
	private static  Map<Character,Integer> listOfCharacters;
	
	static {
		listOfCharacters=new HashMap<>();
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a string ");
		String string=scan.nextLine();
		
		
		
		int size=string.length();
		char [] ch= new char[size];
		for(int i=0;i<size;i++)
		{
			
			 ch [i]=string.charAt(i);
		}
		
		listOfCharacters=CharacterCount.getCount(ch);
		 // Printing the charCountMap 
        for (Map.Entry <Character,Integer>entry : listOfCharacters.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
	}

}
