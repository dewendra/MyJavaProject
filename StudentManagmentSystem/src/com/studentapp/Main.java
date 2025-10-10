package com.studentapp;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*******Student Managment System*********");
		
		Student std1=new Student("S-001", "Alok Singh", 18);
		std1.enrollCourse("Java");
		std1.enrollCourse("Python");
		std1.enrollCourse("React");
		std1.enrollCourse("C#");
		
		Student std2=new Student("S-003", "Ramesh Kumar", 19);
		std2.enrollCourse("Python");
		
		Student std3=new Student("S-002", "Mohan", 20);
		std3.enrollCourse("React");
		
		std1.printStudentInfo();
		std2.printStudentInfo();
		std3.printStudentInfo();
				

	}

}
