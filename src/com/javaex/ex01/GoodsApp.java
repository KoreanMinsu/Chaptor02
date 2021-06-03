package com.javaex.ex01;


public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 40000;
		System.out.println(camera.name + "," + camera.price);
		
		Goods computer = new Goods();
		computer.name = "그램";
		computer.price = 100000;
		System.out.println(camera.name + "," + camera.price);
		
		
				
	}
}
