package _99_extra;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		//story w/ options
		JOptionPane.showMessageDialog(null, "Background info");
		int choiceOne = JOptionPane.showOptionDialog(null, "Choice 1", "Choice", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Good", "Bad"}, null);
		System.err.println(choiceOne);
		if(choiceOne==0){
			int choiceTwoA = JOptionPane.showOptionDialog(null, "Choice 2A", "Choice 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "A", "B"}, null);
		}else if(choiceOne==1) {
			int choiceTwoB = JOptionPane.showOptionDialog(null, "Choice 2B", "Choice 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "A", "B"}, null);
		}else {
			JOptionPane.showMessageDialog(null, "?");
		}
		System.exit(0);
	}
}
//functions?
