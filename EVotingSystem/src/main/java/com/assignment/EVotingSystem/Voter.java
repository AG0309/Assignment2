package com.assignment.EVotingSystem;

import java.time.LocalDate;
import java.time.Period;

public class Voter extends User {
	//Attributes
	private boolean voted;
	
	//Constructors
	public Voter(String name, String surname, String id, LocalDate birth) {
		super.setName(name);
		super.setSurname(surname);
		super.setID(id);
		super.setBirth(birth);
		voted = false;
	}
	
	//Methods
	public int getAge() {
		LocalDate currentDate = LocalDate.now();
		return Period.between(birth, currentDate).getYears();
	}
	
	public boolean canVote() {
		if (!(voted) && getAge() >= 18)
			return true;
		return false;
	}
	
	public void vote() {
		if (canVote())
			voted = true;
	}
}
