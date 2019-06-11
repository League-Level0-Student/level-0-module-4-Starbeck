package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		String m = JOptionPane.showInputDialog(null, "How many pennies do you have?");
		int a = Integer.parseInt(m);
		// Ask the user how many nickels 
		String n = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int b = Integer.parseInt(n);
		// Ask the user how many dimes they have, and convert their answer
		String o = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		int c = Integer.parseInt(o);
		// Ask the user how many quarters they have, and convert their answer
		String p = JOptionPane.showInputDialog(null, "How many quarters do you have?");
		int d = Integer.parseInt(p);
		// Calculate how much money the user has and save it in a double variable 
		int e = (a+(b*5)+(c*10)+(d*25));
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have " + e + " cents.");
	}
}

