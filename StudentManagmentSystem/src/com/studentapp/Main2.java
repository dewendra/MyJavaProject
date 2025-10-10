package com.studentapp;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

	private static List<Student> studentList;
	public static void main(String[] args) {
		studentList=new ArrayList<Student>();
		
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
		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std3);
		Student result=findStudentById("S-004");
		System.out.println("Result : "+result);
		sortByName();

	}
	private static void sortByName() {
		Comparator<Student> studentNameComparator=new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(studentList,studentNameComparator);
		System.out.println(studentList);
	}
	public static Student findStudentById(String studentId) {
		Student result = null;
		try {
			 result=studentList.stream().filter(x->x.getStudenId().equalsIgnoreCase(studentId))
					.findFirst()
					.orElseThrow(()->new RuntimeException("No data found !!"));
					
		} catch (RuntimeException e) {
			System.err.println("Student with id "+studentId+" Not found !!");
		}
		return result;

		
	}

}
