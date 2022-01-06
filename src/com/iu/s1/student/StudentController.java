package com.iu.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil studentUtil = new StudentUtil();
		StudentView studentView = new StudentView();
		studentUtil.initUtil();
		Student [] students = null;
		while(check) {
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프 로 그 램  종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1 :
				students = studentUtil.makeStudents();
				break;
			case 2 :
				if(students !=null) {
				studentView.viewStudents(students);
				}else {
					studentView.view("학생정보를 먼저 입력해 주세요");
				}
				break;
			case 3 : 
				if(students==null) {
					studentView.view("학생정보가 없습니다");
					continue;
				
				}
				Student student = studentUtil.search(students);
				if(student != null) {
					studentView.view(student);
				}else {
					studentView.view("검색 결과가 없습니다");
				}
//				System.out.println("검색할 학생 번호를 입력해 주세요");
//				int num = sc.nextInt();
//				Student student = null;
//				for(int i=0; i<students.length;i++) {
//					if (num == students[i].number) {
//						System.out.println(students[i].name);
//						System.out.println(students[i].number + "번");
//						System.out.println("국어 : " + students[i].kor+"점");
//						System.out.println("영어 : " + students[i].eng + "점");
//						System.out.println("수학 : " + students[i].math + "점");
//						
						
						break;
					
					
					
				
			default :
				//check = !check;
				check=false;
				break;
			
			
		}//switch case
		}//while 끝
	}//Main 끝
	
}
