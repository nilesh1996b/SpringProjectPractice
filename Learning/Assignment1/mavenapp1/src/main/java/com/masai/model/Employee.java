package com.masai.model;

public class Employee {
	
	private int roll;
	private String name;
	private int age;
	Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	

}
