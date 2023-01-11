package exos;

public class Client {
	Tasse tasse;
	Cafe commandeCafe;
	String nom;
	double valeurFacture;
	
	Client(){
		this.nom = "Jean";
		this.tasse.quantiteCafeMax = 100;
	}
	Client(String nom, Cafe commande, boolean tasse){
		this.nom = nom;
		this.commandeCafe = commande;
		if(tasse) {
			this.tasse = new Tasse();
			this.tasse.quantiteCafeMax = 100;
		}
	}
	Client(String nom,Cafe commande, Tasse tasse){
		this.nom = nom;
		this.commandeCafe = commande;
		this.tasse = tasse;
	}
}
