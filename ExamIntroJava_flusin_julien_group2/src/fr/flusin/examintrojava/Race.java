package fr.flusin.examintrojava;

public enum Race {
	
	HUMAIN(18),
	TOGRUTA(3),
	KLACKONS(6),
	KLINGON(12),
	EPSILON(24),
	BORON(48),
	flusin_julien(96);
	
	
	int ageAdulte;
	Race(int ageAdulte){
		this.ageAdulte = ageAdulte;
	}
}
