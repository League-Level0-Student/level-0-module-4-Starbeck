package _09_pi_aloud;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PiAloud {
	public static void main(String[] args) {
		String a = "3.14159265359";
		//JOptionPane.showMessageDialog(null, a.charAt(0));
		for(int i=0;i<a.length(); i++){
			JOptionPane.showMessageDialog(null, a.charAt(i));
		}
		String b=JOptionPane.showInputDialog("What number comes after 3.14159?");
		
		//int c = Integer.parseInt(b);
		//if((b=="two")||(b=="Two")||(b=="TWO")){
		//	JOptionPane.showMessageDialog(null, "Correct");
		//}//if {
			int c = Integer.parseInt(b);
			if(c==2) {
				JOptionPane.showMessageDialog(null, "Correct");
			}else{
				JOptionPane.showMessageDialog(null, "Incorrect");
			}
		//}	
	}
	
	/* 1. Make a main method and make sure your program can run
	2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.
	3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	JOptionPane.showMessageDialog(null, "");
	4. Print ALL the digits of Pi (hint: use a loop)
	5. Use the speak() method to speak all the digits of Pi.
	[ADVANCED]
	6. Get a character from the user using the getInputFromUser() method
	7. Compare the users' char to the next digit of Pi
	8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println
    */
	
	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}
}
