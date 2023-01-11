package project.Project;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class combat {
	int get_other(int actualIndex) {
		if(actualIndex==1) {
			return 0;
		}else {
			return 1;
		}
	}
	combat(player p1, player p2){
		ArrayList<player> players = new ArrayList<player> (Arrays.asList(p1,p2));
		int actualPlayerIndex = 0;
		while(players.get(0).actualHP >= 0 && players.get(1).actualHP >= 0) {
			player actual_player = players.get(actualPlayerIndex);
			player other_player = players.get(get_other(actualPlayerIndex));
			String infosHP = actual_player.name+" a actuellement "+actual_player.actualHP+ " HP";
			infosHP+="\n"+other_player.name+" a actuellement "+other_player.actualHP+" HP";
			JOptionPane.showMessageDialog(null,infosHP,"Infos HP",JOptionPane.PLAIN_MESSAGE);
			int answer = 0;
			if(players.get(actualPlayerIndex).mob) {
				answer = tools.getRandom(1, 2);
			}else {
				answer = tools.askQuestion(players.get(actualPlayerIndex));
			}
			switch(answer){
				case 1:
					actual_player.attack(other_player);
					JOptionPane.showMessageDialog(null,actual_player.name+" vient d'infliger "+(actual_player.attack+actual_player.weapon.attack-other_player.defense)+" dégats à "+other_player.name+" qui a désormais "+other_player.actualHP+" HP !","Infos dégâts",JOptionPane.PLAIN_MESSAGE);
					actualPlayerIndex = get_other(actualPlayerIndex);
					break;
				case 2:
					actual_player.magicUse(other_player);
					JOptionPane.showMessageDialog(null,actual_player.name+" vient d'infliger "+(actual_player.magicAttack+actual_player.weapon.magickattack+5-other_player.defense)+" dégâts magiques à "+other_player.name+ " qui a désormais "+other_player.actualHP+" HP !","Infos dégâts",JOptionPane.PLAIN_MESSAGE);
					actualPlayerIndex = get_other(actualPlayerIndex);
					break;
				case 3:
					actual_player.object.use(actual_player);
					JOptionPane.showMessageDialog(null,actual_player.name+" vient d'utiliser l'objet "+actual_player.object.name,"Infos utilisation objet",JOptionPane.PLAIN_MESSAGE);
					actualPlayerIndex = get_other(actualPlayerIndex);
					break;
				default:
					JOptionPane.showMessageDialog(null,"T'as fait de la merde "+actual_player.name+" il faut choisir parmis 1, 2 ou 3 !!","Erreur de saisie",JOptionPane.ERROR_MESSAGE);
					break;
			}
		}
		int looserIndex = 0;
		if(players.get(0).actualHP<=0) {
			looserIndex = 0;
		}else {
			looserIndex = 1;
		}
		JOptionPane.showMessageDialog(null,players.get(looserIndex).name+" a perdu contre "+players.get(get_other(looserIndex)).name,"Résultats du combat",JOptionPane.PLAIN_MESSAGE);
	}
}