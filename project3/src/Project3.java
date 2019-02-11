/**
 * This project extends project3.
 * Project 3 remains the same. Just the following things should be added.
 * 
 * Create an IllegalBoxException.java. Unlike previous projects, this time along with throwing Exceptions, catch them using Try-Catch
 * Instead of throwing IllegalArgumentExceptions, illegal parameters should throw IllegalBoxException.
 * 
 * Any Illegal Parameter should show up in the console. It should NOT crash the program.
 * 
 * Add a an option "tool" in your GUI. Tool should have a menueItem named "search". 
 * 
 * Using ActionListener, make the "search" option work in such a way so that it takes 3 input, calculates the volume and shows any 
 * box which has volume larger than that box. This should be shown in a second GUI. 
 */

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project3
{	
	public static int totalSize;
	public static UnsortedBoxList ul = new UnsortedBoxList();
	public static SortedBoxList sl = new SortedBoxList();

	
	public static void main(String[] args) throws IOException
	{
		
		File file = new File("C:\\Users\\tahsi\\OneDrive\\Desktop\\input.txt");//Identifying file with proper path (Header: java.io.*)
				
		int[] cd = new int[3];													//String array for String Tokenizer
		
		final BoxGUI GUI = new BoxGUI();										//Creating object BoxGUI
		
		GUI.createAndShowBox();
		try
		{
			Scanner S = new Scanner(file);
			while(S.hasNextLine())													//Loop runs while there is a next line
			{
				String a = S.nextLine();
			
			
				StringTokenizer st = new StringTokenizer(a, ",");					//splits line at delimiter ","(Header: java.util.StringTokenizer)
				int spaces = st.countTokens();
			
				for(int i=0; i<spaces; i++)
				{
					cd[i] = Integer.parseInt(st.nextToken());
				}
			
				try																	//Checks if the box is legal
				{
					ul.add(new Box(cd[0], cd[1], cd[2]));							//adding unsorted boxes to the list
					sl.add(new Box(cd[0], cd[1], cd[2]));
					totalSize++;
					
				}catch(IllegalBoxException e)
				{
					System.out.printf(e.getMessage());
				}
			}
			S.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found!");
		}
		
		
		GUI.textArea1.setEditable(false);										//Sets the textArea uneditable
		GUI.textArea1.append("Valid unsorted Box List:\n");
		
		BoxNode tmp = ul.head;
		
		while(tmp != null)														//Loop for printing unsorted nodes
		{
			GUI.textArea1.append(tmp.data.toString());
			tmp = tmp.next;
		}
		
		GUI.textArea2.setEditable(false);										//Sets the textArea uneditable
		GUI.textArea2.append("Valid sorted Box List:\n");
		
		BoxNode tmp1 = sl.head;
		
		while(tmp1 != null)														//Loop for printing sorted nodes
		{
			GUI.textArea2.append(tmp1.data.toString());
			tmp1 = tmp1.next;
		}
	}
}