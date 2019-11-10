package _99_extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

//
import java.applet.AudioClip;

//Skeleton Complete
//awaiting fill-out

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * points
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "For this game, we'll play the start of a song,\n and the player has to guess the rest of the lyrics.");
		// 5. Use the playSound method to play your song.
		
		JOptionPane.showMessageDialog(null, "DES PA ____");
		// 6. Make a pop-up for the player to type their answer.
		String a = JOptionPane.showInputDialog(null, "What goes next?");
		// 7. If they answered correctly, tell them that they were right.
		int points=0;
		int totalPoints = 0;
		
		if(a.equals("CITO")) {
			JOptionPane.showMessageDialog(null, "correct");
			points += 50;
			totalPoints += 50;
		}else {
			JOptionPane.showMessageDialog(null, "incorrect");
			totalPoints += 50;
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		JOptionPane.showMessageDialog(null, "a b ");
		// 6. Make a pop-up for the player to type their answer.
		String b = JOptionPane.showInputDialog(null, "What goes next?");
		// 7. If they answered correctly, tell them that they were right.
		if(b.equals("c")) {
			JOptionPane.showMessageDialog(null, "correct");
			points += 50;
			totalPoints += 50;
		}else {
			JOptionPane.showMessageDialog(null, "incorrect");
			totalPoints += 50;
		}
		// 9. Record another sound and repeat steps 5-8.
		
		// 10. [optional] Add a points variable that will calculate their final score.
		JOptionPane.showMessageDialog(null, "You scored " + points + " points out of " + totalPoints + " possible points. \nYou got " + ((points*100)/totalPoints) + "% of the questions correct.");
		
	}
	
	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}

