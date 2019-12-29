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
		//while life>0; //do >death (w/exception checks
		//JOptionPane.showMessageDialog(null, "Background info");
		String MCName = JOptionPane.showInputDialog(null, "What is this character's name?");
		int MCCaste = JOptionPane.showOptionDialog(null, MCName + ",\nDo you want to choose your caste or have it randomized?\n(realistic randomization loosely based on caste rarity for realism)", "message title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "True Randomization (0)", "Realistic Randomization (1)", "Choose (2)"}, null);
		//JOptionPane.showMessageDialog(null, MCCaste);
		//Timeline Divergence Start!
		if(MCCaste==0){
			caste=trueRandomInt(0);
			String casteString=Integer.toString(caste);
			casteType=RandomString(casteString);
			JOptionPane.showMessageDialog(null, caste + ", or " + casteType + ".");
			//int choiceTwoA = JOptionPane.showOptionDialog(null, "secondOption confirm message", "secondOption confirm title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cancel (0)", "Confirm (1)"}, null);
			//score = score-1;
			//maxScorePossible = score+1;
		}else if(MCCaste==1) {
			caste=realisticRandomInt(0);
			String casteString=Integer.toString(caste);
			casteType=RandomString(casteString);
			JOptionPane.showMessageDialog(null, caste + ", or " + casteType + ".");
			//int choiceTwoB = JOptionPane.showOptionDialog(null, "firstOption confirm message", "firstOption confirm title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cancel (0)", "Confirm (1)"}, null);
			//score = score+1;
			//maxScorePossible = score+1;
		}else if(MCCaste==2){
			caste=Integer.parseInt(JOptionPane.showInputDialog(null, "What do you want your caste to be?\n(0-11)"));
			String casteString=Integer.toString(caste);
			//if caste is between 0 and 11
			casteType=RandomString(casteString);
			JOptionPane.showMessageDialog(null, caste + ", or " + casteType + ".");
		}else{
			JOptionPane.showMessageDialog(null, "0_0");
		}
		System.exit(0);
	}
	
	public static int realisticRandomInt(int caste){
		caste = 0;
		Random rand = new Random();
		int randCaste = rand.nextInt(101);
		if(randCaste==100){
			caste=0;//mutant
		}else if(randCaste>=97){
			caste=11;//eridan
		}else if(randCaste>=94) {
			caste=6;//kanaya
		}else if(randCaste>=89){
			caste=10;//gamzee
		}else if(randCaste>=82){
			caste=9;//equias
		}else if(randCaste>=74){
			caste=8;//vriska
		}else if(randCaste>=64){
			caste=7;//terezi
		}else if(randCaste>=52){
			caste=5;//nepeta
		}else if(randCaste>=37){
			caste=3;//sollux
		}else if(randCaste>=20){
			caste=2;//tavros
		}else{
			caste=1;//aradia
		}
		return caste;
	}
	
	public static String RandomString(String casteType){
		int randCaste=Integer.parseInt(casteType);
		casteType="mutant";
		if(randCaste==4){
			casteType="mutant";
		}else if(randCaste==11){
			casteType="violet";
		}else if(randCaste==6) {
			casteType="jade";
		}else if(randCaste==10){
			casteType="purple";
		}else if(randCaste==9){
			casteType="indigo";
		}else if(randCaste==8){
			casteType="blue";
		}else if(randCaste==7){
			casteType="teal";
		}else if(randCaste==5){
			casteType="olive";
		}else if(randCaste==3){
			casteType="gold";
		}else if(randCaste==2){
			casteType="bronze";
		}else if(randCaste==1){
			casteType="burgandy";
		}else if(randCaste==0){
			casteType="mutant";
		}else {
			//oof
		}
		return casteType;
	}
	
	public static int trueRandomInt(int caste){
		caste = 0;
		Random rand = new Random();
		int randCaste = rand.nextInt(12);
		if(randCaste==4){
			caste=0;//mutant
		}else if(randCaste==11){
			caste=11;//eridan
		}else if(randCaste==6) {
			caste=6;//kanaya
		}else if(randCaste==10){
			caste=10;//gamzee
		}else if(randCaste==9){
			caste=9;//equias
		}else if(randCaste==8){
			caste=8;//vriska
		}else if(randCaste==7){
			caste=7;//terezi
		}else if(randCaste==5){
			caste=5;//nepeta
		}else if(randCaste==3){
			caste=3;//sollux
		}else if(randCaste==2){
			caste=2;//tavros
		}else{
			caste=1;//aradia
		}
		return caste;
	}
}

//save ability possible???
//functions? for/while confirms? only sometimes? option to turn off/on? go back 1 option?
//timeline based //Nonlinear?? randomization?? likelihoods?? map pre-made or randomized? options for both?
//npcs?? loyalty?? quadrants?? teams?? caste options/randomization??
//character traits?? Hidden vs Shown? 
//gameStart
//change z=x+y then x=y then y=z x still == old y && != new y
//19 aradia//17 tavros//15 sollux//12 nepeta//10 terezi//8 vriska//7 equias//6 gamzee//3 kanaya//2 eridan//1 karkat//for up/down town??
//if (caste==100){}else if(caste>=98){}else if(){}else if(){}