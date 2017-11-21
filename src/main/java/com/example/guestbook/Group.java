package com.example.guestbook;

public class Group {
	String name;
	Tutor tutor;
	String startOfCourse;
	String endOfCourse;
	
	// Descriptive fields
	String location;
	
	
	
	public boolean allowsStudentToRegister(Student s) {
		return true;
	}
}
