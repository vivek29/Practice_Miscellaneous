package com.practice.vivek;
import javax.swing.*;					// import swing package

public class gui {

	
	public static void main(String ar[]){
	
		String fn = JOptionPane.showInputDialog("Enter 1st no");		// takes string i/p
		String sn = JOptionPane.showInputDialog("Enter 2nd no");		// takes string i/p
	
		int num1 = Integer.parseInt(fn);		// parses string into int type
		int num2 = Integer.parseInt(sn);		// parses string into int type
		
	int sum = num1+num2;
		
		JOptionPane.showMessageDialog(null, "The sum is" +sum, "TITLE", JOptionPane.PLAIN_MESSAGE );
	
									// above it takes 4 parameters
									// null - to display in the center of the screen
									// "The sum is" +sum - to display the message/ output
									// TITLE - display at the top of message dialog
									// JOptionPane.PLAIN_MESSAGE - to display just a plain message
									// other alternatives are to put some icons on the gui.
	}
	
	
}
