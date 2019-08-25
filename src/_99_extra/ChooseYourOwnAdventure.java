package _99_extra;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		//story w/ options
		int score = 10;
		int maxScore = 10;
		//int plot = 0;
		//int scene = 0;
		JOptionPane.showMessageDialog(null, "Background info");
		int choiceOne = JOptionPane.showOptionDialog(null, "Land-dwelling or sea-dwelling?", "Caste", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Sea", "Land"}, null);
		//System.err.println(choiceOne);
		if(choiceOne==0){
			int choiceTwoA = JOptionPane.showOptionDialog(null, "So your a seadweller.", "Seadwellers", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "No", "Yes"}, null);
			score = score-1;
			maxScore = score+1;
		}else if(choiceOne==1) {
			int choiceTwoB = JOptionPane.showOptionDialog(null, "So your a landweller.", "Common Bloods", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "No", "Yes"}, null);
			score = score+1;
			maxScore = score+1;
		}else {
			JOptionPane.showMessageDialog(null, "?");
		}
		System.exit(0);
	}
}
//functions?
