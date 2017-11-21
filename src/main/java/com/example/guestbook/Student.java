package com.example.guestbook;

import java.util.ArrayList;

public class Student extends Person {
	Integer matrikelNummer;
	ArrayList<StudentAttendance> attendances = new ArrayList<>();
	
	public Student(String name) {
		this.name = name;
		
	}
	
	public Student registerToGroup(Student s, Group g) {
		if (g.allowsStudentToRegister(s)) {
			// todo implement later 
			// ArrayList<StudentAttendance> newAttendances = g.getAttendances();
			
			
		}
	}
	
}
