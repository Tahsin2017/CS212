import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class BoxGUI
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
		
		JScrollPane scrollPane2 = new JScrollPane(textArea2);		//Creates Scrolling bar
		frame.getContentPane().add(scrollPane2);					//Adds the scrolling bar to the GUI
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Tool", false);
		JMenuItem item = new JMenuItem("Search");
		
		menu.add(item);
		menu.addSeparator();
		menuBar.add(menu);
		
		
		frame.setJMenuBar(menuBar);
		frame.pack();												//For reshaping the GUI according to input text
		frame.setVisible(true);										//Makes the GUI visible
		
		
		class search implements ActionListener
		{
			public void actionPerformed (ActionEvent e)
			{
				String r = JOptionPane.showInputDialog("Enter length of the box: ");
				int l = Integer.parseInt(r);
				
				String  s= JOptionPane.showInputDialog("Enter width of the box: ");
				int w = Integer.parseInt(s);
				
				String t = JOptionPane.showInputDialog("Enter height of the box: ");
				int h = Integer.parseInt(t);
				
				if(l<=0 || w<=0 || h<=0)
				{
					JOptionPane.showMessageDialog(null, "There is illegal parameter. Length, width or height cannot be less or equal to zero.");
					System.exit(0);
				}
				
				SearchAction sa = new SearchAction();
				
				Box boxForSearch = new Box(l,w,h);
				
				sa.searchAndPrint(boxForSearch, Project3.ul);
			}
		}
		
		item.addActionListener(new search());
	}
	
	public void createSearchBox()
	{
		JFrame frame = new JFrame("Search Result");						//Creating GUI with name = "BoxGUI" (Header: javax.swing.*)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Defining default close operation
		frame.setSize(100,100);										//Sets FrameSize
		frame.setLocation(200,200);		
		
		JScrollPane scrollPane1 = new JScrollPane(textArea1);		//Creates Scrolling bar
		frame.getContentPane().add(scrollPane1);					//Adds the scrolling bar to the GUI
		
		frame.pack();												//For reshaping the GUI according to input text
		frame.setVisible(true);										//Makes the GUI visible
	}
}
