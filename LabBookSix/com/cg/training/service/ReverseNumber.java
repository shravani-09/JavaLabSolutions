package com.cg.training.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNumber 
{
	static StringBuilder string;
	private static List<String> list=new ArrayList<>();

	public static void getReverseNumberArray(int[] num) {
		
		
		String[] str=new String [num.length];

        for (int i = 0; i < num.length; i++)
        { 
        	str[i] = String.valueOf(num[i]);
        }
        
        for (int i = 0; i < num.length; i++)
        { 
        	System.out.print(" "+str[i]);
        	string=new StringBuilder(str[i]);
        	string.reverse();
        	System.out.print(" reverse is: "+"\n"+string);
        	list.add(string.toString());
        }
        
        Collections.sort(list);
    	System.out.println("\nsorted list");
        for(String s:list)
        {
        	System.out.println(s);
        }
      
		
		
		
	}
	

}
