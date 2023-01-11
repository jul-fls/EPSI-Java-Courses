package exos;

public class Tasse {
	double quantiteCafeMax;
	Cafe cafe;
	
	Tasse(){
		this.quantiteCafeMax = 100;
	}
	Tasse(double quantiteCafeMax){
		this.quantiteCafeMax = quantiteCafeMax;
	}
	double boire(double quantite){
		this.cafe.quantiteLiquideMl -= quantite;
		return this.cafe.quantiteLiquideMl;
	}
	void boire(){
		this.cafe.quantiteLiquideMl = 0;
	}
}
