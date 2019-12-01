package _99_extra;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import java.applet.AudioClip;
import java.util.Random;
//import random??
//(remove "!="s when it becomes true)
// (!=) Skeleton Complete W/ room for change and additions
//awaiting fill-out

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		//System.err.println();
		//story w/ options
		//hidden statsssss
		int score = 10; //show?
		int maxScorePossible = 10; //keep hidden
		int life = 20; //show
		int caste = 0;
		String casteType = "mutant";
		//int plot = 0; //hide
		//int scene = 0; //hide/show at top?
		//while life>0; //do >
		//JOptionPane.showMessageDialog(null, "Background info");
		String MCName = JOptionPane.showInputDialog(null, "What is this character's name?");
		int MCCaste = JOptionPane.showOptionDialog(null, "Do you want to choose your caste or have it randomized?\n(realistic randomization loosely based on caste rarity for realism)", "message title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "True Randomization (0)", "Realistic Randomization (1)", "Choose (2)"}, null);
		//JOptionPane.showMessageDialog(null, MCCaste);
		//Timeline Divergence Start!
		if(MCCaste==0){
			//realisticRandom();
			int choiceTwoA = JOptionPane.showOptionDialog(null, "secondOption confirm message", "secondOption confirm title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cancel (0)", "Confirm (1)"}, null);
			score = score-1;
			maxScorePossible = score+1;
		}else if(MCCaste==1) {
			realisticRandom();
			//int choiceTwoB = JOptionPane.showOptionDialog(null, "firstOption confirm message", "firstOption confirm title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cancel (0)", "Confirm (1)"}, null);
			//score = score+1;
			//maxScorePossible = score+1;
		}else if(MCCaste==2){
			JOptionPane.showMessageDialog(null, "?");
		}else{
			
		}
		System.exit(0);
	}
	public static void realisticRandom() {
		int caste = 0;
		Random rand = new Random();
		int randCaste = rand.nextInt(101);
		String casteType="mutant";
		if(randCaste==100){
			caste=0;//mutant
			casteType="mutant";
		}else if(randCaste>=97){
			caste=11;//eridan
			casteType="violet";
		}else if(randCaste>=94) {
			caste=6;//kanaya
			casteType="jade";
		}else if(randCaste>89){
			caste=10;//gamzee
			casteType="purple";
		}else if(randCaste>=82){
			caste=9;//equias
			casteType="indigo";
		}else if(randCaste>=74){
			caste=8;//vriska
			casteType="blue";
		}else if(randCaste>=64){
			caste=7;//terezi
			casteType="teal";
		}else if(randCaste>=52){
			caste=5;//nepeta
			casteType="olive";
		}else if(randCaste>=37){
			caste=3;//sollux
			casteType="gold";
		}else if(randCaste>=20){
			caste=2;//tavros
			casteType="bronze";
		}else{
			caste=1;//aradia
			casteType="burgandy";
		}
		JOptionPane.showMessageDialog(null, caste + ", or " + casteType);
	}
}

//save ability possible???
//functions? for/while confirms? only sometimes? option to turn off/on? go back 1 option?
//timeline based //Nonlinear?? randomization?? likelihoods?? map pre-made or randomized?
//npcs?? loyalty?? quadrants?? teams?? caste options/randomization??
//character traits?? Hidden vs Shown? 
//gameStart
//change z=x+y then x=y then y=z x still == old y && != new y
//19 aradia//17 tavros//15 sollux//12 nepeta//10 terezi//8 vriska//7 equias//6 gamzee//3 kanaya//2 eridan//1 karkat//for up/down town??
//if (caste==100){}else if(caste>=98){}else if(){}else if(){}