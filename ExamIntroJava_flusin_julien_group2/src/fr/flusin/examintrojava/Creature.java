package fr.flusin.examintrojava;

public class Creature {
	String nom;
	Race race;
	int age;
	
	Creature(){
		this.nom = "flusin";
		this.race = Race.HUMAIN;
		this.age = 42;
	}
	
	Creature(String nom, Race race, int age){
		this.nom = nom;
		this.race = race;
		this.age = age;
	}
	
	boolean isAdulte() {
		if(this.age >= this.race.ageAdulte) {
			return true;
		}else {
			return false;
		}
	}
	
	void afficherInformations() {
		System.out.println("Mon nom est "+this.nom+". Je suis un "+this.race+". Je suis un "+(isAdulte() ? "Adulte"  : "Enfant")+".");
	}
}
