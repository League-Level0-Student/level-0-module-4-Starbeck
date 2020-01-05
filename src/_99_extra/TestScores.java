package _99_extra;
import javax.swing.JOptionPane;
public class TestScores {
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("What is your test score?");
		double b = Double.parseDouble(a);
		if((b<=100) && (b>=98)) {
			JOptionPane.showMessageDialog(null, "A+");
		}else if((b>=93) && (b<=97)) {
			JOptionPane.showMessageDialog(null, "A");
		}else if((b>=90) && (b<=92)) {
			JOptionPane.showMessageDialog(null, "A-");
		}else if((b>=87) && (b<=89)) {
			JOptionPane.showMessageDialog(null, "B+");
		}else if((b>=83) && (b<=86)) {
			JOptionPane.showMessageDialog(null, "B");
		}else if((b>=80) && (b<=82)) {
			JOptionPane.showMessageDialog(null, "B-");
		}else if((b>=77) && (b<=79)) {
			JOptionPane.showMessageDialog(null, "C+");
		}else if((b>=73) && (b<=76)) {
			JOptionPane.showMessageDialog(null, "C");
		}else if((b>=70) && (b<=72)) {
			JOptionPane.showMessageDialog(null, "C-");
		}else if((b>=67) && (b<=69)) {
			JOptionPane.showMessageDialog(null, "D+");
		}else if((b>=63) && (b<=66)) {
			JOptionPane.showMessageDialog(null, "D");
		}else if((b>=60) && (b<=62)) {
			JOptionPane.showMessageDialog(null, "D-");
		}else if((b>=0) && (b<100)) {
			JOptionPane.showMessageDialog(null, "F");
		}else {
			JOptionPane.showMessageDialog(null, "Either your input is invalid, or you got higher than 100%.\nEither way, you already know your answer.");
		}
		System.exit(0);
	}
}
