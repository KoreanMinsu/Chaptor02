package com.javaex.ex12;

public class PersonApp {
	public static void main(String[] args) {
		
		Person p00 = new Person("정우성", 45);
		System.out.println(p00.toString());
		
		p00.setAge(50);
		System.out.println(p00.getAge());
		
		p00.showInfo();
		
		Student s00 = new Student("이효리", 40, "제주고등학교");
		System.out.println(s00.toString());
			
	}

}
