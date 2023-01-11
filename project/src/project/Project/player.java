package project.Project;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
public class player {
	boolean mob;
	int actualHP;
	int actualMP;
	int baseHP;
	int baseMP;
	int attack;
	int defense;
	int magicAttack;
	String name;
	classes classe;
	armor armor;
	weapon weapon;
	object object;
	public ArrayList<String> Names = new ArrayList<String> (Arrays.asList(
			"Âme-en-peine", "Déva", "Banshie","Mâne","Dragon Rouge","Mage Drow",
			"Esprit Follet","Garou Chacal","Blême","HobGobelin","Mimique","Tarasque",
			"Lierre Malade"));
	player(String name, armor armor, weapon weapon){
		this.mob = false;
		this.name = name;
		this.baseHP = 10;
		this.baseMP = 10;
		this.actualHP = this.baseHP;
		this.actualMP = this.baseMP;
		this.attack = 10;
		this.defense = 10;
		this.magicAttack = 10;
		this.armor = armor;
		this.weapon = weapon;
		this.classe = project.Project.classes.BARBARIAN;
		this.object = project.Project.object.HEAL;
	}
	player(String name, armor armor, weapon weapon, object object, classes classe){
		this.mob = false;
		this.name = name;
		this.classe = classe;
		this.baseHP = this.classe.baseHP;
		this.baseMP = this.classe.baseMP;
		this.actualMP = this.baseMP;
		this.actualHP = this.baseHP;
		this.attack = this.classe.attack;
		this.defense = this.classe.defense;
		this.magicAttack = this.classe.magicAttack;
		this.armor = armor;
		this.weapon = weapon;
		this.object = object;
	}
	player(boolean mob){
		if(mob) {
			this.mob = true;
			this.name = this.Names.get(tools.getRandom(0, 12));
			this.attack = tools.getRandom(5,25);
			this.baseHP = tools.getRandom(10,50);
			this.baseMP = tools.getRandom(10,50);
			this.actualHP = this.baseHP;
			this.actualMP = this.baseMP;
			this.defense = tools.getRandom(5,20);
			this.magicAttack = tools.getRandom(5,25);
			this.weapon = new weapon();
		}
	}
	public void attack(player player2) {
		if((this.attack + this.weapon.attack - player2.defense<0)) {
			JOptionPane.showMessageDialog(null,"L'attaque envers "+player2.name+" a fait 0 dégâts !","Infos dégâts nuls",JOptionPane.PLAIN_MESSAGE);
			player2.actualHP = player2.actualHP - 0;
		}else {
			player2.actualHP = player2.actualHP - (this.attack + this.weapon.attack - player2.defense);
		}
	}
	public void magicUse(player player2) {
		this.actualMP--;
		if(((this.magicAttack + 5) + this.weapon.magickattack - player2.defense<0)) {
			JOptionPane.showMessageDialog(null,"L'attaque envers "+player2.name+" a fait 0 dégâts !","Infos dégâts nuls",JOptionPane.PLAIN_MESSAGE);
			player2.actualHP = player2.actualHP - 0;
		}else {
			player2.actualHP = player2.actualHP-((this.magicAttack + 5) + this.weapon.magickattack - player2.defense);
		}
	}
}