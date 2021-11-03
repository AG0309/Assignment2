package com.assignment.EVotingSystem;

public class Voter extends Manager {
	//Attributes
	private String ID;
	private boolean voted;
	
	//Constructors
	public Voter(String ID) {
		this.setID(ID);
		voted = false;
	}
	
	//Methods
	private String getID() {
		return ID;
	}
	
	private void setID(String ID) {
		this.ID = ID;
	}
	
	public boolean validID() {
		ID = getID();
		return true;
	}
	
	public boolean canVote() {
		if (!(voted) && validID())
			return true;
		return false;
	}
	
	public void vote() {
		if (canVote())
			voted = true;
	}
}
