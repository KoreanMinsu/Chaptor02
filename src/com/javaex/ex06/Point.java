package com.javaex.ex06;

public class Point {
//field
	private int x;
	private int y;
	
//constructor
	public Point() {
	}
	
	public Point(int x) {
		this.x = x;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//두 매개변수를 하나의 메소드 안에 시도함 - 가능
	public void setXY(int pointX, int pointY) {
		this.x=pointX;
		this.y=pointY;
	}
	
	
	
	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}


	public void draw() {
		//그리는 복장한 기능 구현 가정
		System.out.println("점[x=" +  x + ", y="+ y + "]을 그렸습니다.");
	}

	public void draw(boolean flag) 	{
		//그리는 복장한 기능 구현 가정
		if(flag=true) {
			System.out.println("점[x=" +  x + ", y="+ y + "]을 그렸습니다.");
		} else {
			System.out.println("점[x=" +  x + ", y="+ y + "]을 지웠습니다.");
		}
	}
}
