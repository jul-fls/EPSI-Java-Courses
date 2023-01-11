package project.Project;

import javax.swing.JOptionPane;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q1 = "Comment vous appelez-vous ?";
		String p1_name = JOptionPane.showInputDialog(q1);
		String q2 = "Quelle classe voulez-vous (1: Barbare, 2: Ranger, 3: Voleur, 4: Magicien)";
		int answerq2 = Integer.parseInt(JOptionPane.showInputDialog(q2));
		classes p1_classe = classes.BARBARIAN;
		if(answerq2 >=1 && answerq2 <=4) {
			switch(answerq2) {
				case 1:
					p1_classe = classes.BARBARIAN;
					break;
				case 2:
					p1_classe = classes.RANGER;
					break;
				case 3:
					p1_classe = classes.THIEF;
				case 4:
					p1_classe = classes.MAGICIAN;
					break;
			}
		}else {
			JOptionPane.showMessageDialog(null,"On as dit entre 1 et 4, débile !!\nT'es con donc tu es un Barbare !","Erreur de saise",JOptionPane.ERROR_MESSAGE);
		}
		String q3 = "Quel objet souhaitez-vous acquérir (1: Potion de Heal, 2: Potion de magie)";
		int answerq3 = Integer.parseInt(JOptionPane.showInputDialog(q3));
		object p1_object = object.HEAL;
		if(answerq3 >=1 && answerq3 <=2) {
			switch(answerq3) {
				case 1:
					p1_object = object.HEAL;
					break;
				case 2:
					p1_object = object.MAGIC;
					break;
			}
		}else {
			JOptionPane.showMessageDialog(null,"On as dit entre 1 et 2, débile !!\nAttention, réception imminente de potion de Heal dans ta gueule !","Erreur de saisie",JOptionPane.ERROR_MESSAGE);
		}
		player player1 = new player(p1_name, new armor(armor.noms.get(tools.getRandom(0, 9)), 20), new weapon(),p1_object,p1_classe);
		player player2 = new player(true);
		combat combat1 = new combat(player1, player2);
	}
}
