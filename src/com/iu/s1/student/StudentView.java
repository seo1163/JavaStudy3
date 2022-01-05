package com.iu.s1.student;

import java.util.Scanner;

public class StudentView {
	
	//출력 전용
	//viewStudents - 여러명의 학생의 모든 정보를 출력
	
	public void viewStudents(Student [] students) {
		
		for(int i=0; i<students.length; i++) {
			Student student = students[i];
			System.out.println("이름 : " + student.name);
			System.out.println("번호 : " + student.number);
			System.out.println("국어 : " + student.kor);
			System.out.println("영어 : " + student.eng);
			System.out.println("수학 : " + student.math);
			
		}
		
	}
	
	//viewStudent - 학생의 모든 정보를 출력
	
	public void viewStudent(Student student) {
		System.out.println("이름 : " + student.name );
		System.out.println("번호 : " + student.number);
		System.out.println("국어 : " + student.kor);
		System.out.println("영어 : " + student.eng);
		System.out.println("수학 : " + student.math);
	
//	public void viewMessage(String message) {
//		//문자열 출력
//		System.out.println("-----------------------------");
//		System.out.println(message);
//		System.out.println("-----------------------------");
	
	}
	
}
