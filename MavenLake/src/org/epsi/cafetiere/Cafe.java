package org.epsi.cafetiere;

public class Cafe {
 
	public TypeCafe typeCafe  ; 
	public double quantiteLiquideMl ; 
	
	public Cafe() {
		typeCafe = TypeCafe.MOKA ; 
		quantiteLiquideMl = 100 ; 
	}
	
	Cafe(TypeCafe typeCafe, double quantiteLiquideMl) {
		this.typeCafe = typeCafe ; 
		this.quantiteLiquideMl = quantiteLiquideMl ; 
	}
	
}