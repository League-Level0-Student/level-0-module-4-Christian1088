package doubles_and_booleans;

import javax.swing.JOptionPane;

public class Testscores {

public static void main(String[]args) {

 String score =	JOptionPane.showInputDialog("What did you get on your test score");
	float test = Float.parseFloat(score);
	if(test>=90) {
		JOptionPane.showMessageDialog(null, "You got an A. Good job");
		
	}
	else if(test>=80) {
		JOptionPane.showMessageDialog(null, "You got a B. Good job");
	}
	
	else if(test>=70) {
		JOptionPane.showMessageDialog(null, "You got a C. Study harder next time");
	}
	
	else if(test>=60) {
		JOptionPane.showMessageDialog(null, "You got a D. Study harder next time");
	}
	
	else if(test>=50) {
		JOptionPane.showMessageDialog(null, "You failed");
	}
	
	else if(test>=50) {
		JOptionPane.showMessageDialog(null, "You really need to study harder");
	}
	
	else if(test>=0) {
		JOptionPane.showMessageDialog(null, "You really need to study harder");
	}
	
	
	
	
	
	
	
	
}	
}