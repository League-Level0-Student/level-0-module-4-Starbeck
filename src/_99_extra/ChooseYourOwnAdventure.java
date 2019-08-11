package _99_extra;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		//story w/ options
		int score = 10;
		//int plot = 0;
		//int scene = 0;
		JOptionPane.showMessageDialog(null, "Background info");
		int choiceOne = JOptionPane.showOptionDialog(null, "Choice 1", "Choice", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "No", "Yes"}, null);
		//System.err.println(choiceOne);
		if(choiceOne==0){
			int choiceTwoA = JOptionPane.showOptionDialog(null, "Choice 2A", "Choice 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "A", "B"}, null);
			score = score-1;
		}else if(choiceOne==1) {
			int choiceTwoB = JOptionPane.showOptionDialog(null, "Choice 2B", "Choice 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "A", "B"}, null);
			score = score+1;
		}else {
			JOptionPane.showMessageDialog(null, "?");
		}
		System.exit(0);
	}
}
//functions?
