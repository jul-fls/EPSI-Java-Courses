package exos;

public class Cafetiere {
	void remplirTasse(Tasse tasse) {
		if(tasse.cafe == null) {
			tasse.cafe = new Cafe();
		}
		tasse.cafe.typeCafe = TypeCafe.MOKA;
		tasse.quantiteCafeMax = tasse.cafe.quantiteLiquideMl;
	}
	void remplirTasse(Tasse tasse, TypeCafe typecafe, double quantite) {
		if(tasse.cafe == null) {
			tasse.cafe = new Cafe();
		}
		tasse.cafe.typeCafe = typecafe;
		tasse.cafe.quantiteLiquideMl = quantite;
	}
}
