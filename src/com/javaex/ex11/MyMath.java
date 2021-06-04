package com.javaex.ex11;
//static 실험
public class MyMath {
	public static double pi = 3.14;
	
	public static int plus(int a, int b) {
		int result = a + b; //복잡한 계산식 가정
		return result;
	}
	
	public static double plus(double a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double plus(double a, int b) {
		double result = a + b;
		return result;
	}
	
	public static double plus(int a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double circleArea(int radius ) {
		double result = radius*radius*pi;
		return result;
	}
	
}
