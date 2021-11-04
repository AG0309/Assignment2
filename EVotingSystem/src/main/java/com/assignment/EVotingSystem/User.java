package com.assignment.EVotingSystem;

import java.time.LocalDate;

public class User {
	//Attributes
	protected String name;
	protected String surname;
	protected String id;
	protected LocalDate birth;
	
	//Methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//TODO: check if name is valid
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		//TODO: check if surname is valid
		this.surname = surname;
	}
	
	public String getID() {
		return id;
	}
	
	public void setID(String id) {
		//TODO: check if ID is valid
		this.id = id;
	}
	
	public LocalDate getBirth() {
		return birth;
	}
	
	public void setBirth(LocalDate birth) {
		//TODO: check if birth is valid
		this.birth = birth;
	}
}
