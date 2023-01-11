package exos;

import java.util.ArrayList;

public class Restaurant {
	Cafetiere cafetiere;
	double profit;
	ArrayList<Client> listeClientServi;
	String nom;
	public Restaurant() {
		this.cafetiere = new Cafetiere();
		this.nom = "Le restaurant";
		this.listeClientServi = new ArrayList<Client>();
	}
	public Restaurant(String nom) {
		this.nom = nom;
		this.cafetiere = new Cafetiere();
		this.listeClientServi = new ArrayList<Client>();
	}
	double servir(Client client) {
		if(client.commandeCafe.typeCafe == TypeCafe.BATARD) {
			System.out.println("Tu déconnes, "+client.nom+" sale batard !");
		}
		if(client.tasse == null) {
			client.tasse = new Tasse(100);			
			client.valeurFacture += 2;
		}else {
			if(client.commandeCafe.typeCafe != client.tasse.cafe.typeCafe) {
				client.commandeCafe.typeCafe = TypeCafe.BATARD;
			}
		}
		if (client.commandeCafe.quantiteLiquideMl>100){
			client.tasse = new Tasse(500);
			client.valeurFacture += 3;
		}else if(client.commandeCafe.quantiteLiquideMl > 500) {
			client.commandeCafe = new Cafe();
		}else {
			System.out.println("Tu déconnes "+client.nom+" t'es sacrément débile, t'en as mis partout !");
			client.valeurFacture = (client.commandeCafe.typeCafe.coutParMl * client.commandeCafe.quantiteLiquideMl);
			client.commandeCafe.quantiteLiquideMl = client.tasse.quantiteCafeMax;
		}
		client.commandeCafe = new Cafe();
		client.valeurFacture = (client.commandeCafe.typeCafe.coutParMl * client.commandeCafe.quantiteLiquideMl);
		this.profit += client.valeurFacture;
		return client.valeurFacture;
	}
}