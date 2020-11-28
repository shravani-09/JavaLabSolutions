package com.cg.training.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.training.dto.Student;

public class GenerateScholarship
{
	private static Map<Integer, MedalType> scholarshipList;

	
	static {
		scholarshipList=new HashMap<Integer, MedalType>();
	}


	public static Map<Integer, MedalType> getStudents(Map<Integer, Student> studentDetailsList) 
	{
		
		for(Map.Entry<Integer, Student> e: studentDetailsList.entrySet())
		{
			if(e.getValue().getMarks()>=90)
			{
				scholarshipList.put(e.getKey(), MedalType.GOLD);
			}else if(e.getValue().getMarks()>=80 && e.getValue().getMarks()<=90)
			{
				scholarshipList.put(e.getKey(), MedalType.SILVER);
			}else if(e.getValue().getMarks()>=70 && e.getValue().getMarks()<=80)
			{
				scholarshipList.put(e.getKey(), MedalType.BRONZE);
			}
		
		}
		
		return scholarshipList;
		
		
	}

	
}
