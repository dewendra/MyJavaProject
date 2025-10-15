package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	private static List<Student> studentList;
	private static Scanner sc;

	public static void main(String[] args) {
		studentList = new ArrayList<Student>();

		System.out.println("*******Student Managment System*********");
		sc = new Scanner(System.in);
		while (true) {
			System.out.println("********* Welcome *********");

			System.out.println("Select an options..");
			System.out.println("1 Register an student");
			System.out.println("2 Find student with Student Id");
			System.out.println("3 List all Student info");
			System.out.println("4 List all Student info in sorted order");
			System.out.println("5 Exit");
			int options = sc.nextInt();

			switch (options) {
			case 1:
				enrollStudent(sc);

				break;
			case 2:
				findStudentById(sc);
				break;
			case 3:
				printAllStudentData();
				break;
			case 4:
				sortByName();
				break;
			case 5:
				exit();
				break;

			default:
				System.out.println("Invalid options selected !!");
			}
		}
	}

	private static void findStudentById(Scanner sc2) {
		Student studentFound = null;
		System.out.println("Enter the student Id.");
		String studentId=sc2.next();
		try {
			studentFound = studentList.stream().filter(student -> student.getStudenId().equalsIgnoreCase(studentId)).findFirst()
					.orElseThrow(() -> new RuntimeException("No data found !!"));

		} catch (RuntimeException e) {
			System.err.println("Student with id " + studentId + " Not found !!");
		}
		studentFound.printStudentInfo();

	}

	private static void exit() {
		System.exit(0);

	}

	private static void printAllStudentData() {
		if (studentList.size() > 0) {

			System.out.println("---------- Printing All Student Data-------------");
			for (Student student : studentList) {
				student.printStudentInfo();
			}
		} else {
			System.err.println("No Student Found !!!.");
		}
	}

	private static void enrollStudent(Scanner sc) {
		sc = new Scanner(System.in);
		System.out.println("Enter Student Id..");
		String id = sc.next();
		System.out.println("Enter Student Name..");
		String name = sc.next();
		System.out.println("Enter Student age..");
		int age = sc.nextInt();
		Student student = new Student(id, name, age);
		studentList.add(student);
		while (true) {

			System.out.println("Enter Student course.. And Type Done to exit...");
			String courseName = sc.next();
			if (courseName.equalsIgnoreCase("done")) {
				break;
			}
			student.enrollCourse(courseName);
		}
		student.printStudentInfo();
	}

	private static void sortByName() {
		Comparator<Student> studentNameComparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(studentList, studentNameComparator);
		printAllStudentData();
		//System.out.println(studentList);
	}

	public static Student findStudentById(String studentId) {

		Student result = null;
		try {
			result = studentList.stream().filter(x -> x.getStudenId().equalsIgnoreCase(studentId)).findFirst()
					.orElseThrow(() -> new RuntimeException("No data found !!"));

		} catch (RuntimeException e) {
			System.err.println("Student with id " + studentId + " Not found !!");
		}
		return result;

	}

}
