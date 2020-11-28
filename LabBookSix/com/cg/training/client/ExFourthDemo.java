package com.cg.training.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.dto.Student;
import com.cg.training.service.GenerateScholarship;
import com.cg.training.service.MedalType;

public class ExFourthDemo {
	private static Map<Integer,Student> studentDetailsList =new HashMap<Integer, Student>();
	private static Map<Integer,MedalType> studentScholarshipList =new HashMap<Integer, MedalType>();
	private static Scanner sc=new Scanner(System.in);
	
//	static {
//		
//	}
//	
	public static void main(String[] args) {
		
		while(true)
		{
			Student student=new Student();
		
			System.out.println("enter student id");
			student.setStudentRegistrationNo(Integer.parseInt(sc.nextLine()));
			System.out.println("enter student marks");
			student.setMarks(Integer.parseInt(sc.nextLine()));
			
			
			studentDetailsList.put(student.getStudentRegistrationNo(), student);
			
			studentScholarshipList=GenerateScholarship.getStudents(studentDetailsList);
			
			showStudentScholarshipList();
			
			System.out.println("Enter y to continue..");
			String ch=sc.nextLine();
			if(!ch.equalsIgnoreCase("y")) {
				break;
			}
			 
		}
		
	}

	private static void showStudentScholarshipList() 
	{
		for (Map.Entry <Integer,MedalType>entry : studentScholarshipList.entrySet()) { 
		    System.out.println(entry.getKey() + " " + entry.getValue()); 
		}
	}

}
