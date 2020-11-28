package com.cg.training.dto;

import com.cg.training.service.MedalType;

public class Student 
{
	private Integer studentRegistrationNo;
	private Integer marks;
	private MedalType medalType;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentRegistrationNo, Integer marks, MedalType medalType) {
		super();
		this.studentRegistrationNo = studentRegistrationNo;
		this.marks = marks;
		this.medalType = medalType;
	}

	public Integer getStudentRegistrationNo() {
		return studentRegistrationNo;
	}

	public void setStudentRegistrationNo(Integer studentRegistrationNo) {
		this.studentRegistrationNo = studentRegistrationNo;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public MedalType getMedalType() {
		return medalType;
	}

	public void setMedalType(MedalType medalType) {
		this.medalType = medalType;
	}

	@Override
	public String toString() {
		return "Student [studentRegistrationNo=" + studentRegistrationNo + ", marks=" + marks + ", medalType="
				+ medalType + "]";
	}

	
	

}
