package _99_extra;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		String a = "rAnDoM uPpEr AnD lOwEr CaSe ChArAcTeRs";
		// 2. Print your String to the console in upper case.
		
		// 3. Print your String to the console in lower case.
		
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end) a.substring(0,3)
		JOptionPane.showMessageDialog(null, a.substring(0,3));
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		//JOptionPane.showMessageDialog(null, (a.charAt((a.length()-3))) + (a.charAt((a.length()-2))) + (a.charAt((a.length()-1))));
	}
}
