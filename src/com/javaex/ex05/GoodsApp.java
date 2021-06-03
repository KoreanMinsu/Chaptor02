package com.javaex.ex05;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods(); //default constructor
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		Goods computer = new Goods("그램", 100000);
		computer.showInfo();
		
	}
}
