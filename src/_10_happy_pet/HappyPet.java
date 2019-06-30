package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String petKind = JOptionPane.showInputDialog(null, "What kind of pet do you want to buy?", "kind of pet");
		int happinessLevel = 0;
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while(happinessLevel <= 100) {
			
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to care for your pet.", "Pet Care", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Feed", "Clean", "Groom" , "???"}, null); //groom=2, clean=1, feed=0
			//System.err.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
			if(task==0) {
				JOptionPane.showMessageDialog(null, "You fed your pet");
				happinessLevel = happinessLevel+((100/3)+1);
			}else if(task==1) {
				JOptionPane.showMessageDialog(null, "You cleaned your pet");
				happinessLevel = happinessLevel+((100/3)+1);
			}else if(task==2) {
				JOptionPane.showMessageDialog(null, "You groomed you pet");
				happinessLevel = happinessLevel+((100/3)+1);
			}else {
				JOptionPane.showMessageDialog(null, "?");
				//happinessLevel = Random(100);
			}
			if(happinessLevel >= 100) {
				JOptionPane.showMessageDialog(null, "You love your pet");
				break;
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
	}
		System.exit(0);
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}