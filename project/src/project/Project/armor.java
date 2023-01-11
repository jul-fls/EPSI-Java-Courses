package project.Project;

import java.util.ArrayList;
import java.util.Arrays;

public class armor {
	String name;
	int defensepoints;
	armor(String name, int defensepoints){
		this.name = name;
		this.defensepoints = defensepoints;
	}
	int get_defensepoints() {
		return this.defensepoints;
	}
	void set_defensepoints(int defensepoints) {
		this.defensepoints = defensepoints;
	}
	String get_name() {
		return this.name;
	}
	void set_name(String name) {
		this.name = name;
	}
	public static ArrayList<String> noms = new ArrayList<String> (Arrays.asList(
			"Armor of Ending Ancestors",
			"Greatplate of Infernal Freedom",
			"Adamantite Batteplate of Divine Freedom",
			"Golden Chestplate of Haunted Bloodlust",
			"Relentless Demon Cuirass",
			"Tyrannical Mail Breastplate",
			"Lonely Cuirass of the Warrior",
			"Burnished Armor of the Immortals",
			"Steel of Undoing",
			"Soul of the Corrupted"
	));
}