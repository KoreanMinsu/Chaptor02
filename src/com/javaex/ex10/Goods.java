package com.javaex.ex10;

public class Goods {
//field
	private String name;
	private int price;
	
//contsructor
	public Goods() {
	}
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
//method(g/s)
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
	System.out.println("===================");
	}
	

}
