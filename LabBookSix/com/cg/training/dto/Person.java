package com.cg.training.dto;

public class Person
{
	private Integer id;
	private Integer age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(Integer id, Integer age) {
		super();
		this.id = id;
		this.age = age;
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + "]";
	}
	
	

}
