package project.Project;

public enum object {
	HEAL("Heal potion",20,0),
	MAGIC("Magic potion",0,15);
	String name; 
	int restoredHealth;
	int restoredMagic;
	
	object (String name, int restoredHealth,int restoredMagic) {
		this.name = name;
		this.restoredHealth = restoredHealth;
		this.restoredMagic = restoredMagic;
	}
	public void use(player player) {
		if(player.actualHP + this.restoredHealth < player.baseHP){
			player.actualHP+=this.restoredHealth;
		}else {
			player.actualHP = player.baseHP;
		}
		if(player.actualMP + this.restoredMagic < player.baseMP){
			player.actualMP+=this.restoredMagic;
		}else {
			player.actualMP = player.baseMP;
		}
	}
}