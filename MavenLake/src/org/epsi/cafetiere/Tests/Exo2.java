package org.epsi.cafetiere.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.epsi.cafetiere.Cafe;
import org.epsi.cafetiere.Cafetiere;
import org.epsi.cafetiere.Tasse;
import org.epsi.cafetiere.TypeCafe;
import org.junit.jupiter.api.Test;

public class Exo2 {
	@Test
	public void TestTropBu() {
		Tasse tasse = new Tasse(80);
		tasse.cafe = new Cafe();
		tasse.cafe.typeCafe = TypeCafe.MOKA;
		tasse.boire(100);
		assertEquals(tasse.cafe.quantiteLiquideMl, 0);
	}
	
	@Test
	public void AjoutCafeACafetiere() {
		Cafetiere cafetiere = new Cafetiere();
		Tasse tasse = new Tasse();
		cafetiere.remplirTasse(tasse);
	}
}
