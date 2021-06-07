package com.javaex.ex12;

public class Person {
//field	
	private String name;
	private int age;
	
//constructor	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//method - g/s	
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
//데이터확인용 
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
		
	
//method - general
	public void showInfo() {
		System.out.println("이름: "+name+ "\t 나이"+age);
	}
	
}
