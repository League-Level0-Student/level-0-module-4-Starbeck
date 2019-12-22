package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		while(true){
			String a = JOptionPane.showInputDialog(null, "Input the first number.");
			int c = Integer.parseInt(a);
			String b = JOptionPane.showInputDialog(null, "Input the second number.");
			int d = Integer.parseInt(b);
			int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide"},null);
			if(operation==0){
				add(c,d);
			}else if(operation==1){
				subtract(c,d);
			}else if(operation==2){
				multiply(c,d);
			}else if(operation==3){
				divide(c,d);
			}else {
				System.exit(0);
			}
			int exitOrContinue = JOptionPane.showOptionDialog(null, "Do you want to do more calculations or exit?", "message title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Exit", "Continue"}, null);
			if(exitOrContinue==1) {
				//continue as normal
			}else {
				System.exit(0);
			}
		}
	}
	static void add(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + "+" + num2 + "=" + (num1+num2));
	}
	static void multiply(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + "x" + num2 + "=" + (num1*num2));
	}
	static void divide(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + "/" + num2 + "=" + (num1/num2));
	}
	static void subtract(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + "-" + num2 + "=" + (num1/num2));
	}
}