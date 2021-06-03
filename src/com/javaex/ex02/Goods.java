package com.javaex.ex02;

public class Goods {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		if(this.price<0) {
			return 0;
		} else {
		return price;
		}
	}
	
	public void setPrice(int price) {
		
		this.price = price;
		/*
 		if(price<0) {
			this.price=0;
		} else {
			this.price = price;	
		}
		*/
	}
	
	
	
	
	
	public void showInfo() {
		System.out.println("상품명: " + name);
		
		System.out.println("상품가격: " + getPrice());

		
		System.out.println("----------------");
	}
}
