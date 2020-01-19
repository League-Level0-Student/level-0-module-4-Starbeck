package _99_extra;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class StringMethods2 {
	public static void main(String[] args) {
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		String a = "cReAtE a StRiNg VaRiAbLe AnD iNiTiAlIzE iT wItH rAnDoM uPpEr AnD lOwEr CaSe ChArAcTeRs";
		System.err.print(a + "\n");
		// 2. Print your String to the console in upper case.
		String e = a.toLowerCase();
		System.err.print(e + "\n");
		// 3. Print your String to the console in lower case.
		String f = a.toUpperCase();
		System.err.print(f + "\n");
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end) a.substring(0,3)
		JOptionPane.showMessageDialog(null, a.substring(0,3));
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		JOptionPane.showMessageDialog(null, a.substring(41,42));
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		int b = a.length()-3;
		int c = a.length()-2;
		int d = a.length()-1;
		//String e=a.charAt(a.length(-3));
		//String f;
		//String g;
		JOptionPane.showMessageDialog(null, "Index " + b + ", index " + c + ", and index " + d + ".");
		//JOptionPane.showMessageDialog(null, a.charAt(85));
	}
}
