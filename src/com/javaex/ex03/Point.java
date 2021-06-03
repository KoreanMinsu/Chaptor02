package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	//두 매개변수를 하나의 메소드 안에 시도함 - 가능
	public void setXY(int pointX, int pointY) {
		this.x=pointX;
		this.y=pointY;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	

	public int getX() {
		return x ;
		
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x=" +  x + ", y="+ y + "]을 그렸습니다.");
	}
}
