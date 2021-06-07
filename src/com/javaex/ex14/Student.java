package com.javaex.ex14;

public class Student extends Person{

	//필드
		private String schoolName;

		
	//생성자
		public Student() {
			System.out.println("Student()");
		}
		
		/*
	// 부모의 Person(2) 생성자 사용	 
		public Student(String name, int age, String schoolName) {
			//super(name, age);
			
			
			this.schoolName = schoolName;
			System.out.println("Student(3)");
		}
		*/
		
		
		//부모의 Person()생성자 사용
		public Student(String name, int age, String schoolName) {
			super();
			super.setName(name);
			this.setAge(age);
			this.schoolName=schoolName;
			System.out.println("Student(3)");
			
		}
		//메소드-g/s
		public String getSchoolName() {
			return schoolName;
		}

		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}

		//메소드-일반
		@Override
		public String toString() {
			return "Student [schoolName=" + schoolName + "]";
		}
		
		public void showInfo() {
			System.out.println("------------------------------------");
			System.out.println("이름:" + super.name);
			System.out.println("나이:" + age);
			System.out.println("학교:" + schoolName);
			System.out.println("------------------------------------");
		}
		
		
		
}
