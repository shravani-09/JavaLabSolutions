package com.cg.training.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class SecondSmallestElement 
{

	public static int getSecondSmallest(Integer[] num) {
		
		
		List<Integer> arrayList =new ArrayList<Integer>(Arrays.asList(num)); 
		
		Collections.sort(arrayList);
		
		return arrayList.get(1);
		
		
	}
	

}
