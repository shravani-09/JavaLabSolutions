package com.cg.training.service;

import java.util.HashMap;
import java.util.Map;

public class CalculateSquare
{

	public static Map<Integer, Integer> getSquare(int[] num) 
	{
		
		HashMap<Integer, Integer> squaresMapList 
        = new HashMap<Integer, Integer>();
		
		for(int n:num )
		{
			squaresMapList.put(n, n*n);
		}
		
		return squaresMapList;

		
		
	}

}
