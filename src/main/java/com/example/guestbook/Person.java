package com.example.guestbook;

import com.googlecode.objectify.annotation.Id;

public abstract class Person {

	@Id int id;
	String name;

}
