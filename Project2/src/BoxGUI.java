import javax.swing.*;
import java.awt.GridLayout;

public class BoxGUI	extends JFrame
{
	public JTextArea textArea1 = new JTextArea(5,20);				//Defining textArea
	public JTextArea textArea2 = new JTextArea(5,20);
	
	public void createAndShowBox()
	{
		JFrame frame = new JFrame("BoxGUI");						//Creating GUI with name = "BoxGUI" (Header: javax.swing.*)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Defining default close operation
		frame.setSize(100,100);										//Sets FrameSize
		frame.setLocation(200,200);									//Sets Frame Location
		frame.setLayout(new GridLayout(1,2));						//Sets gridLayout with 1 row and 2 column (Header: java.awt.GridLayout)
		
		JScrollPane scrollPane1 = new JScrollPane(textArea1);		//Creates Scrolling bar
		frame.getContentPane().add(scrollPane1);					//Adds the scrolling bar to the GUI
		
		JScrollPane scrollPane2 = new JScrollPane(textArea2);
		frame.getContentPane().add(scrollPane2);
		
		frame.pack();												//For reshaping the GUI according to input text
		frame.setVisible(true);										//Makes the GUI visible
	}
}
