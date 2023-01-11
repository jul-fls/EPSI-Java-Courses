package fr.flusin.examintrojava;

import java.util.ArrayList;

public class CapsuleDeSecour extends Vehicule{
	ArrayList<Creature> passagers = new ArrayList<>();
	int nbMaximumPassager;
	boolean isInSpace;
	
	public CapsuleDeSecour() {
		this.isInSpace = false;
		this.nbMaximumPassager = 3;
	}
	
	ArrayList<Creature> lanceCapsule() {
		this.isInSpace = true;
		return this.passagers;
	}
}