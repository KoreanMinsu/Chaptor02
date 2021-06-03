package com.javaex.ex02;



public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		computer.setName("그램");
		computer.setPrice(900000);
		
		cup.setName("버그컵");
		cup.setPrice(2000);
		
		
		camera.showInfo();
		
		computer.showInfo();
		
		cup.showInfo();
		

		
		
	}
}
