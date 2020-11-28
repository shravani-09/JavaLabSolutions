package com.cg.training.service;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount 
{
	public static Map<Character, Integer> getCount(char ch[])
	{
		// Creating a HashMap containing char 
        // as a key and occurrences as  a value 
        HashMap<Character, Integer> charCountMap 
            = new HashMap<Character, Integer>(); 
  
        // Converting given string to char array 
  
//        char[] strArray = inputString.toCharArray(); 
  
        // checking each char of strArray 
        for (char c : ch) { 
            if (charCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
                charCountMap.put(c, 1); 
            } 
        } 
        return charCountMap;
       
	}

}
