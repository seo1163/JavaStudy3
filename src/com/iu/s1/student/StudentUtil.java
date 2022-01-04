package com.iu.s1.student;

import java.util.Scanner;









public class StudentUtil {
	
	public Student[] makeStudents() {
		//학생의 수를 입력 받음
		//키보드로 부터 이름, 번호, 국어, 영어 수학 입력
		//학생들의 정보를 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		Student [] students = new Student[count];

		for (int i = 0; i <students.length; i++) {
			Student student = new Student();
			
			
			System.out.println("학생의 이름을 입력하세요");
			student.name = sc.next();
			System.out.println("학생의 번호를 입력하세요");
			student.number = sc.nextInt();
			System.out.println("학생의 국어점수 입력");
			student.kor = sc.nextInt();
			System.out.println("학생의 수학점수 입력");
			student.math = sc.nextInt();
			System.out.println("학생의 영어점수 입력");
			student.eng = sc.nextInt();
		
			students[i] = student;
	}//for의 끝
		//Student student = new Student();
		
		return students;
	}
	public Student makeStudent() {
		//키보드로 부터 이름, 번호, 국어, 영어 수학 입력 리턴
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("번호를 입력하세요");
		int number = sc.nextInt();
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		//1. 배열 - 같은 데이터타입 (X)
		//2. class
		Student student = new Student();
		student.name=name;
		student.number=number;
		student.kor=kor;
		student.eng=eng;
		student.math=math;
		
		return student;
		
		
		
	}
	
}
