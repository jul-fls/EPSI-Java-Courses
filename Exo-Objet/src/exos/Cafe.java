package exos;

public class Cafe {
	TypeCafe typeCafe;
	double quantiteLiquideMl;
	
	Cafe(){
		this.typeCafe = TypeCafe.MOKA;
		this.quantiteLiquideMl = 100;
	}
	Cafe(TypeCafe typeCafe, double quantiteLiquideMl){
		this.typeCafe = typeCafe;
		this.quantiteLiquideMl = quantiteLiquideMl;
	}
}
