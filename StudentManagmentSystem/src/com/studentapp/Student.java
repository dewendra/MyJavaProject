package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	
	private String studenId;
	private String name;
	private int age;
	private List<String> courses;
	
	
	public Student() {
		
	}
	
	public Student(String studenId, String name, int age) {
		super();
		if(validateAge(age) && validateName(name) && validateStudentId(studenId)) {
			this.studenId = studenId;
			this.name = name;
			this.age = age;
			courses=new ArrayList<String>();
		}
	}
	
	

	public String getStudenId() {
		return studenId;
	}
	public void setStudenId(String studenId) {
		this.studenId = studenId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printStudentInfo() {
		System.out.println("========= Student Info ===========");
		System.out.println("Student Id : "+studenId);
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("Enrolled Course : "+courses);
	}

	@Override
	public String toString() {
		return "Student [studenId=" + studenId + ", name=" + name + ", age=" + age + ", courses=" + courses + "]";
	}
	
	public void enrollCourse(String course) {
		if(validCourseName(course)) {
			if(!courses.contains(course)) {
				courses.add(course);
				System.out.println("Course added successfully..");
			}else {
				System.err.println("Student is already enrolled to course "+course);
			}
		}
	}
	
	//validations method
	
	public boolean validateAge(int age) {
		if(age>=18 && age<=35) {
			return true;
		}else {
			System.err.println("Please Enter age between 18 - 35.");
			return false;
		}
	}
	public boolean validateName(String name) {
		String nameRegex="^[a-zA-Z\\s]+$";
		Pattern	namePattern=Pattern.compile(nameRegex);
		Matcher nameMatcher=namePattern.matcher(name);
		if(nameMatcher.matches()) {
			return true;
		}else {
			System.err.println("Please enter name as alphabates only");
			return false;
		}
		
	}
	private boolean validateStudentId(String studenId2) {
		String idRegex="S-[0-9]+$";
		Pattern idPattern=Pattern.compile(idRegex);
		Matcher idMatcher=idPattern.matcher(studenId2);
		if(idMatcher.matches()) {
			return true;
		}else {
			System.err.println("Invalid Student id !! Use the format S-0001");
			return false;
		}
	}
	
	public boolean validCourseName(String course) {
		if(course.equalsIgnoreCase("Java")||course.equalsIgnoreCase("Python")||course.equalsIgnoreCase("Android")
				||course.equalsIgnoreCase("React")) {
			return true;
		}else {
			System.err.println("Invalid course !! Please enter course from the List:[Java, Python, Android, React]");
			return false;
		}
	}

}
