package com.javaex.ex11;

public class MyMathApp {
	
	
	public static void main(String[] args) {
		
		/*
		MyMath myMath = new MyMath();
		System.out.println(myMath.plus(100, 100));
		System.out.println(myMath.plus(200.1, 200.1));
		System.out.println(myMath.plus(300.2, 300));
		System.out.println(myMath.plus(400.3, 400));
		*/
		
		System.out.println(MyMath.plus(99,99)); //using static area.
		System.out.println(MyMath.plus(10.1, 12.4));
		
		MyMath myMath = new MyMath(); //static 사용시 이렇게 쓸 필요가 없다
		System.out.println(MyMath.plus(100,100));
	}
}
