package com.javaex.ex09;

public class Goods {
//field	
	private String name;
	private int price;
	private static int count;

//constructor
	public Goods() {
		count = count+1;

	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count = count+1;
	}

//method(getter/setter)
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
	
	
//method general
	public void showInfo() {
		System.out.println("상품이름: "+ this.name);
		System.out.println("가격: " + this.price);
		System.out.println("count:" + count);
		System.out.println("===================");
	}


}
