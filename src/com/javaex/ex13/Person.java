package com.javaex.ex13;

public class Person {
	
	private String name;
	private int age;
	
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
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
//데이터확인용 toString
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
//method - general
	public void showInfo() { //출력위해.. 만들기 힘들고 오래걸림
		System.out.println("이름: "+name+ "\t 나이"+age);
	}
	
}
