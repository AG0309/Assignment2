package com.assignment.EVotingSystem;

public class Manager {
	//Attributes
	//Constructors
	//Methods
	
	
	//MAIN TEST
	public static void main(String[] args) {
		Voter a = new Voter("AY5678");
		
		System.out.println(a.canVote());
		a.vote();
		System.out.println(a.canVote());
		
		Voter b = new Voter("AY5878");
		
		b.vote();
		System.out.println(b.canVote());
	}
}
