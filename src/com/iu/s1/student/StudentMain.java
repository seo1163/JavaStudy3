package com.iu.s1.student;




public class StudentMain {

	public static void main(String[] args) {
		
	
		StudentView sv = new StudentView();
		
		Student [] students = new Student[2];
		
		Student student= new Student();
		student.name="iu";
		student.number=1;
		student.kor=100;
		student.eng=95;
		student.math=95;
		students[0]=student;
		
		
		student = new Student();
		student.name="YI";
		student.number=2;
		student.kor=100;
		student.eng=95;
		student.math=95;
		students[1]=student;
		
		sv.viewStudents(students);
		
		
		
	}

}
