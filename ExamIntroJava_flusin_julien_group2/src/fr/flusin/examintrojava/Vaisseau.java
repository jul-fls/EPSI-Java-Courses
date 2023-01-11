package fr.flusin.examintrojava;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Vaisseau extends Vehicule{
	Creature capitaine;
	ArrayList<Creature> passagers = new ArrayList<>();
	ArrayList<CapsuleDeSecour> capsulesDeSecour = new ArrayList<>();
	int nbMaximumPassager;
	
	Vaisseau(){
		this.capitaine = new Creature("flusin_julien",Race.HUMAIN,42);
		this.capsulesDeSecour.add(new CapsuleDeSecour());
		this.capsulesDeSecour.add(new CapsuleDeSecour());
	}
	
	Vaisseau(Creature capitaine, ArrayList<Creature> passagers, int nbMaximumPassagers, int nbCapsulesDeSecour){
		this.capitaine = capitaine;
		this.passagers = passagers;
		this.nbMaximumPassager = nbMaximumPassagers;
		for(int i = 0; i < nbCapsulesDeSecour; i++) {
			this.capsulesDeSecour.add(new CapsuleDeSecour());
		}
	}
	@Override
	boolean ajouterPassager(Creature creature) {
		if(this.passagers.size()<this.nbMaximumPassager) {
			this.passagers.add(creature);
			this.passagers.get(this.passagers.size()-1).afficherInformations();
			return true;
		}else {
			System.out.println("La créature "+creature.nom+" de type "+creature.race+" n'as pas été accepté au sein de ce vaisseau car il est plein !");
			return false;
		}
	}
	
	void ajouterPassagerClandestin(Creature creature, int potDeVin) {
		this.passagers.add(creature);
	}
	
	boolean ajouterPassagerCapsuleSecour() {
		int premiereCapsuleDisponible = 0;
		
		for(int i = 0;i<this.capsulesDeSecour.size();i++) {
			if(this.capsulesDeSecour.get(i).passagers.size()<this.capsulesDeSecour.get(i).nbMaximumPassager) {
				premiereCapsuleDisponible = i;
			}
		}
		
		if(this.passagers.size() == 0 || this.capsulesDeSecour.size() == 0 || this.capsulesDeSecour.get(premiereCapsuleDisponible).passagers.size()>=this.capsulesDeSecour.get(premiereCapsuleDisponible).nbMaximumPassager) {
			return false;
		}
		if(this.capsulesDeSecour.get(premiereCapsuleDisponible).ajouterPassager(this.passagers.get(0))) {
			this.passagers.remove(0);
			return true;
		}else {
			return false;
		}
	}
	
	boolean lancerCapsuleSecour(CapsuleDeSecour capsule) {
		if(capsule.passagers.size()>=capsule.nbMaximumPassager) {
			capsule.lanceCapsule();
			return true;
		}else {
			if(this.passagers.size()==0) {
				if(capitaine.nom!="flusin") {
					capsule.passagers.add(capitaine);
					capsule.lanceCapsule();
					return true;
				}else {
					JOptionPane.showMessageDialog(null, "J'ai bien peur de ne pas pouvoir faire ça, Dave.");
					return false;
				}
			}else {
				capsule.lanceCapsule();
				return true;
			}
		}
	}
}
