package com.javaex.ex03;

public class PointApp {
	public static void main(String[] args) {
		
		Point p01 = new Point();
	    Point p02 = new Point();
		
		p01.setXY(5,5); // 하나의 메소드에 두 매개변수 - 가능
		p01.setX(5);
		p01.setY(5);
		
		p02.setXY(10,23);// 하나의 메소드에 두 매개변수 - 가능
		p02.setX(10);
		p02.setY(23);
			
		
		p01.draw();
		p02.draw();
		
	}
}
