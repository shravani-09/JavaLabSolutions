package com.cg.training.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.dto.Person;
import com.cg.training.service.VotingService;

public class ExSixthDemo {
	private static Scanner sc=new Scanner(System.in);
	private static Map<Integer,Person> voterListMap;
	private static List<Integer> voterList=new ArrayList<>();
	
	static {
		voterListMap=new HashMap<>();
		
		
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
				Person person=new Person();
				System.out.println("enter id of person");
				person.setId(Integer.parseInt(sc.nextLine()));
				
				System.out.println("enter age of person");
				person.setAge(Integer.parseInt(sc.nextLine()));
				
				voterListMap.put(person.getId(), person);
				
				voterList=VotingService.getVoterList(voterListMap);
				
				showEligibleCandidateId();
				
				System.out.println("Enter y to continue..");
				String ch=sc.nextLine();
				if(!ch.equalsIgnoreCase("y")) 
				{
					break;
				}
				
		}
	}

	private static void showEligibleCandidateId() {
		int size=voterList.size();
		for(int i=0;i<size;i++)
//		for(Integer p:voterList)
		{
			System.out.println("eligible candidate id: "+voterList.get(i)+"total: "+size);
		}
	}

}
