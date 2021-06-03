package com.javaex.ex05;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() { 
		// default - 다른 생성자 만들면 사라짐
	}
	
	
	public Goods(String name, int price) {
		// Goods  메모리(heap)에 올리는것
		this.name = name;
		this.price = price;
	}
	
	//메소드-게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public void showInfo() {
		System.out.println( "상품이름: "+name);
		System.out.println("가격: "+price);
		System.out.println("=============");
		
	}
	
}

