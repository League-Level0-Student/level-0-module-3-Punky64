//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100 )+ 1;
		// 2. Print out the random variable above
		
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		     for (int i = 0; i < 21; i++) {
				
		
             String jim = JOptionPane.showInputDialog("Pick a number between 100 and 1 you have ten trys");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
             int g = Integer.parseInt(jim); 
			// 5. if the guess is correct
             if(g == random) {
            	 JOptionPane.showMessageDialog(null, "You got it");
              break;
             }
             
				// 6. win
			// 7. if the guess is high
             if(g>random) {
            	 JOptionPane.showMessageDialog(null, "to high");
             }
				// 8. tell them it's too high
             if(g<random) {
            	 JOptionPane.showMessageDialog(null, "to low");
             }
			// 9. if the guess is low
				// 10. tell them it's too low

		// 12. tell them they lose
	
		     }
		     JOptionPane.showMessageDialog(null, "you lose");
	}

	
	}





