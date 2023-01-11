package org.epsi.cafetiere.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.epsi.cafetiere.Cafe;
import org.epsi.cafetiere.Tasse;
import org.epsi.cafetiere.TypeCafe;
import org.junit.jupiter.api.Test;

public class Exo1 {
	@Test
	public void TestTasseNormale() {
		Tasse tasse = new Tasse();
		assertEquals(tasse.quantiteCafeMax, 100);
		assertNull(tasse.cafe);
	}
	
	@Test
	public void TestTasseBue() {
		Tasse tasse = new Tasse();
		tasse.cafe = new Cafe();
		tasse.cafe.typeCafe = TypeCafe.MOKA;
		tasse.boire();
		assertEquals(tasse.cafe.quantiteLiquideMl, 0);
	}
	
	@Test
	public void TestAjoutCafeQuantite() {
		Tasse tasse = new Tasse();
		tasse.cafe = new Cafe();
		tasse.cafe.typeCafe = TypeCafe.MOKA;
		tasse.cafe.quantiteLiquideMl = 200;
		tasse.quantiteCafeMax = 200;
		assertEquals(tasse.quantiteCafeMax, 200);
		assertEquals(tasse.cafe.quantiteLiquideMl, 200);
	}
	
	@Test
	public void TestBatard() {
		Tasse tasse = new Tasse();
		tasse.cafe = new Cafe();
		tasse.cafe.typeCafe = TypeCafe.MOKA;
		Cafe cafe2 = new Cafe();
		cafe2.typeCafe = TypeCafe.BOURBON;
		tasse.addCafe(cafe2);
		assertEquals(tasse.cafe.typeCafe, TypeCafe.BATARD);
	}
}
