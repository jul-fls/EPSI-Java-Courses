package exos;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	@SuppressWarnings("rawtypes")
	static ArrayList<ArrayList> listeListeClients = new ArrayList<ArrayList>();
	
	static ArrayList<Client> listeClient1 = new ArrayList<>();
	static ArrayList<Client> listeClient2 = new ArrayList<>();
	static ArrayList<Client> listeClient3 = new ArrayList<>();
	static ArrayList<Client> listeClientsExpulse = new ArrayList<Client>();
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		Restaurant resto1 = new Restaurant("Latte sur les rochers");
		Restaurant resto2 = new Restaurant("Une tasse de joie");
		Restaurant resto3 = new Restaurant();
		listeListeClients.add(listeClient1);
		listeListeClients.add(listeClient2);
		listeListeClients.add(listeClient3);
		for(int i = 0;i<60;i++) {
			String nom = BanqueDeDonnee.listeNoms.get(getRandomNumberInRange(0,BanqueDeDonnee.listeNoms.size()));
			Cafe commande = BanqueDeDonnee.listeCommandes.get(getRandomNumberInRange(0,BanqueDeDonnee.listeCommandes.size()));
			Tasse tasse = BanqueDeDonnee.listeTasses.get(getRandomNumberInRange(0,BanqueDeDonnee.listeTasses.size()));
			Client client = new Client(nom,commande,tasse);
			if(commande.typeCafe != TypeCafe.BATARD) {
				listeListeClients.forEach(valeur -> {
					if(valeur.size()<20) {
						
					}
				});
				listeListeClients.get(getRandomNumberInRange(0, i)).add(client);
			}else {
				listeClientsExpulse.add(client);
				System.out.println("Casse toi "+client.nom);
			}
		}
	}
}