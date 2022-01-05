package com.iu.s1.student;

public class Student {
	
	//Data 저장 용도
	
	String name;
	int number;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void makeTotal() {
		int total; //선언되는 변수의 메모리영역이 달라서 선언 가능 따라서 중복선언X
//		System.out.println("참조변수 this");
//		System.out.println("참조변수 this : "+this);
		this.total = kor + eng + math;
		this.avg = this.total/3.0;
		//평균계산
		//this 생략 가능
		//단 지역변수와 멤버변수명이 같은 경우 구분하기 위해 this를 사용
		//구분을 해주지 않으면 제일 가까운곳에서 찾는다
		//메서드 내에서 다른 메서드 호출가능 단 멤버메서드 앞에 참조변수가 있어야한다.
		//hello();
	}
	
	public void hello() {
//		System.out.println("안녕하세요");

	}
//	
}
