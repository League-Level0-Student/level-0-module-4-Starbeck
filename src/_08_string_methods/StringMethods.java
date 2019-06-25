package _08_string_methods;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
		String a = "whatever you want";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		JOptionPane.showMessageDialog(null, a.charAt(2));
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		JOptionPane.showMessageDialog(null, a.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for(int i=0; i<a.length(); i++) {
			JOptionPane.showMessageDialog(null, a.charAt(i));
		}
		String b = JOptionPane.showInputDialog(null, "What letter do you want to find the place of?");
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		for(int j=1; j<=a.length(); j++) {
			if(a.charAt(j)==b.charAt(0)){
				JOptionPane.showMessageDialog(null, "'" + b + "' is at index " + j +".");
			}
		}
	}
}
