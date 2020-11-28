package com.cg.training.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.cg.training.dto.Person;

public class VotingService 
{
	private static final Integer minimunAgeCriteria=18;
	private static List<Integer> voterList=new ArrayList<>();

	public static List<Integer> getVoterList(Map<Integer, Person> voterListMap)
	{
		for(Map.Entry<Integer, Person> p:voterListMap.entrySet())
		{
			if(p.getValue().getAge()>minimunAgeCriteria)
			{
				voterList.add(p.getValue().getId());
			}
		}
		
		return voterList;
		
		
	}
	

}
