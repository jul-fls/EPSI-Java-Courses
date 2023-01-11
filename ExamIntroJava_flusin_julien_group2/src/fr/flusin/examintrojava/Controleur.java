package fr.flusin.examintrojava;

public class Controleur {
	Race race;
	
	public Controleur(Race race) {
		this.race = race;
	}
	
	boolean VerifierVaisseau(Vaisseau vaisseau) {
		boolean testAdulte = true;
		if(!vaisseau.capitaine.isAdulte()) {
			System.out.println("Le capitaine n'est pas adulte, dégager le de là !");
			testAdulte = false;
		}
		boolean testKlingon = true;
		boolean klingondetecte = false;
		for(int i = 0;i<vaisseau.passagers.size();i++) {
			if(vaisseau.passagers.get(i).race==Race.KLINGON) {
				klingondetecte = true;
				break;
			}
		}
		if(klingondetecte&&this.race!=Race.KLINGON) {
			System.out.println("Un klingon est présent parmis nous, or je ne le suis pas, controle échoué !");
			testKlingon = false;
		}
		boolean testKlackons = true;
		boolean klackonsdetecte = false;
		for(int i = 0;i<vaisseau.passagers.size();i++) {
			if(vaisseau.passagers.get(i).race==Race.KLACKONS) {
				klackonsdetecte = true;
				break;
			}
		}
		if(klackonsdetecte) {
			System.out.println("Au moins un klackons est présent parmis nous, je ne peut tolérer cela, controle échoué");
			testKlackons = false;
		}
		boolean testHumains = true;
		int nbHumains = 0;
		for(int i = 0;i<vaisseau.passagers.size();i++) {
			if(vaisseau.passagers.get(i).race==Race.HUMAIN) {
				nbHumains++;
			}
		}
		if(nbHumains%2!=0) {
			System.out.println("Le nb d'humains dans ce vaisseau est impair, cela est inadmissible, controle échoué");
			testHumains = false;
		}
		boolean testUsurpation = true;
		boolean usurpation = false;
		for(int i = 0;i<vaisseau.passagers.size();i++) {
			if(vaisseau.passagers.get(i).race!=Race.HUMAIN&&vaisseau.passagers.get(i).nom=="flusin") {
				usurpation = true;
				break;
			}
		}
		if(usurpation) {
			System.out.println("Quelqu'un se fait passer pour moi, cela est interdit ! Controle échoué !");
			testUsurpation = false;
		}
		
		boolean testRemplissage = true;
		if(vaisseau.passagers.size()>vaisseau.nbMaximumPassager) {
			System.out.println("Le vaisseau est bien trop rempli, sortez tous de là !");
			testRemplissage = false;
		}
		if(testAdulte && testHumains && testKlackons && testKlingon && testRemplissage && testUsurpation) {
			return true;
		}else {
			return false;
		}
	}
}
