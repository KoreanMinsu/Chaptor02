package com.javaex.ex09;

public class GoodsApp {
	//STATIC관련업무 -> STATIC 예제
	//count용도로 사용 잘 안함 -> *배열 -> list
	public static void main(String[] args) {
		

		Goods computer = new Goods("그램", 1000000);
		computer.showInfo();

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
		String[] cars = {"Volvo", "BMW", "Ford"};
		for
		 (String i : cars ) {
		  System.out.println(i);
		}
		
	}
}
