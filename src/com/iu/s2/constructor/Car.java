package com.iu.s2.constructor;

public class Car {
	
	String brand;
	String company;
	String colro;
	int cc;
	
	//생성자 특수한 메서드
	public Car() {
		this("GV80");
//		this.company ="Hyundai";
//		this.cc=5000;
//		this.brand = "GV80";
	}

	public Car(String brand) {
		this(brand,"black");
//		this.company = "Hyundai";
//		this.brand = brand;
//		this.colro = "black";
//		this.cc = 2500;
	}
	
	public Car(String brand,String color) {
		this(brand,color,2500);
//		this.company = "Hyundai";
//		this.brand = brand;
//		this.colro = color;
//		this.cc = 2500;
				
	}
	public Car(String brand, String color, int cc) {
		this.company = "Hyundai";
		this.brand = brand;
		this.colro = color;
		this.cc = cc;
		this.info();
	}
	
	//멤버메서드
	public void info() {
		System.out.println("멤버메서드");
		System.out.println(this.company);
		System.out.println(this.brand);
		System.out.println(this.colro);
		System.out.println(this.cc);
	}
}
