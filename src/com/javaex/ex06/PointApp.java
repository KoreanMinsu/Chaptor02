package com.javaex.ex06;

public class PointApp {
	public static void main(String[] args) {
		
		Point p01 = new Point();
		
		p01.setX(5);
		p01.setY(5);
		p01.draw();
		
		Point p02 = new Point(6,6);
		p02.draw();
		
		Point p03 = new Point(10);
		p03.setY(10);
		p03.draw();
		
		Point p04 = new Point(100);
		p04.draw();
		
		// method overloading
		Point p05 = new Point(50,50);
		p05.draw(true);
		
	}
}
