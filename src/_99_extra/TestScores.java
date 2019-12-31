package _99_extra;
import javax.swing.JOptionPane;
public class TestScores {
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("What is your test score?");
		double b = Double.parseDouble(a);
		if((b<=100) && (b>=90)) {
			JOptionPane.showMessageDialog(null, "A");
		}else if((b>=80) && (b<100)) {
			JOptionPane.showMessageDialog(null, "B");
		}else if((b>=70) && (b<100)) {
			JOptionPane.showMessageDialog(null, "C");
		}else if((b>=60) && (b<100)) {
			JOptionPane.showMessageDialog(null, "D");
		}else if((b>=0) && (b<100)) {
			JOptionPane.showMessageDialog(null, "F");
		}else {
			JOptionPane.showMessageDialog(null, "Either your input is invalid, or you got higher than 100%.\nEither way, you already know your answer.");
		}
		System.exit(0);
	}
}
