package com.example.guestbook;

import java.util.ArrayList;

public class Group {
	String name;
	Tutor tutor;
	ArrayList<Event> scheduledClasses;
	
	// Descriptive fields
	String location;
	
	
	
	public boolean allowsStudentToRegister(Student s) {
		return true;
	}
}
