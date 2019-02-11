/**
 * Use JOptionPane to take a String as an input
 * Find out upper case and lower case E's in that sentence
 * Show your result in a Dialog Box using JOptionPane
 * 
 *  The process should go on until the user types stop 
 *  OR
 *  Presses the 'x' sign at the top right corner of the box
 *  OR
 *  Cancels the Operation
 */

import javax.swing.JOptionPane;	//importing JOptionPane header

public class Project0 
{
	public static void main(String[] args) 
	{		
		while(true)	//Infinite loop with conditions for taking input
		{
			String s = JOptionPane.showInputDialog("Please enter a sentence: ");
		
			if(s == null || s.equalsIgnoreCase("stop"))	//Program stops if "cancel" button is pressed OR "Stop" is typed
				System.exit(0);
		
			int lower_e=0, upper_E=0;	//initialing two integers for keeping counts of upper & lower case 
					
			for(int i=0; i<s.length(); i++)	//loop for finding out e's
			{
				if(s.charAt(i)=='E')	
					upper_E++;
				
				else if(s.charAt(i)=='e')
					lower_e++;
			}
		
			JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lower_e +"\nNumber of upper case e's: " + upper_E);	//Output dialog box
		
		}	
	}
}

