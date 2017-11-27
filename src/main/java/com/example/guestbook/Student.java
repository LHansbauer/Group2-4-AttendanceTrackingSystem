package com.example.guestbook;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.ArrayList;

@Entity
public class Student extends Person {
	Id id;
	String matrikelNumber;
	ArrayList<StudentAttendance> attendances = new ArrayList<>();
	
	public Student(String name) {
		this.name = name;
		
	}
	
	public Student registerToGroup(Student s, Group g) {
		if (g.allowsStudentToRegister(s)) {
			// todo implement later 
			// ArrayList<StudentAttendance> newAttendances = g.getAttendances();
			
			
		}
	return null;
	}
	
}
