package _99_extra;

import javax.swing.JOptionPane;
import java.util.Random;
//import random
// (!=) Skeleton Complete W/ room for change and additions
//awaiting fill-out

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		//int randInt(1, 100);
		//Random caste = new Random(100);
		//int randOut =(rand+1);
		//System.err.println();
		//story w/ options
		//hidden statsssss
		int score = 10; //show?
		int maxScorePossible = 10; //keep hidden
		int life = 20; //show
		//int plot = 0; //hide
		//int scene = 0; //hide/show at top?
		//while life>0; //do >
		JOptionPane.showMessageDialog(null, "Background info");
		int gameStart = JOptionPane.showOptionDialog(null, "message question", "message title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "secondOption (0)", "firstOption (1)"}, null);
		//Timeline Divergence Start!
		if(gameStart==0){
			int choiceTwoA = JOptionPane.showOptionDialog(null, "secondOption confirm message", "secondOption confirm title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cancel (0)", "Confirm (1)"}, null);
			//score = score-1;
			maxScorePossible = score+1;
		}else if(gameStart==1) {
			int choiceTwoB = JOptionPane.showOptionDialog(null, "firstOption confirm message", "firstOption confirm title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cancel (0)", "Confirm (1)"}, null);
			score = score+1;
			maxScorePossible = score+1;
		}else {
			JOptionPane.showMessageDialog(null, "?");
		}
		System.exit(0);
	}
}

//save ability possible???
//functions? for/while confirms? only sometimes? option to turn off/on? go back 1 option?
//timeline based //Nonlinear?? randomization?? likelihoods?? map pre-made or randomized?
//npcs?? loyalty?? quadrants?? teams?? caste options/randomization??
//gameStart
//change z=x+y then x=y then y=z x still == old y && != new y
//19 //17 //14 //12 //9 //8 //7 //6 //5 //2 //1 (mutant) //for up/down town
