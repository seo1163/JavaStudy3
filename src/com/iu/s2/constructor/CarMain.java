package com.iu.s2.constructor;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		//변수 선언
		Car car = new Car();
		
//		car.brand="GV80";
//		car.company="Hyundai";
//		car.cc = 2500;
		car.info();
		//car.Car(); error!!
		Car car2 = new Car("G80");
		
		car2.info();
		
		Car car3 = new Car("G90", "white");
		car3.info();
		
		Car car4 = new Car("Santafe", "Silver", 2000);
		car4.info();
		
		Car car5 = new Car("GV70","Red",2500);
				car5.info();
	}

}
