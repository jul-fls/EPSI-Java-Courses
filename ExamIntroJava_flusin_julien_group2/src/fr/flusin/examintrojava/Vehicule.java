package fr.flusin.examintrojava;

import java.util.ArrayList;

public abstract class Vehicule {
	ArrayList<Creature> passagers = new ArrayList<>();
	int nbMaximumPassager;
	
	boolean ajouterPassager(Creature creature) {
		if(this.passagers.size()<this.nbMaximumPassager) {
			this.passagers.add(creature);
			return true;
		}else {
			System.out.println("Impossible d'ajouter ce passager au véhicule car il est plein !");
			return false;
		}
	}
}
