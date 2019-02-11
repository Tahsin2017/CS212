/**
 * YOU CANNOT USE ARRAY FOR THIS. MUST HAVE TO DO IT WITH LINKED LIST
 * 
 * Create an abstract class BoxList.java
 * Create a class BoxNode.java and define each box as a node.
 * Box.java is same as Project1 but the parameters here should be declared private.
 * Create two classes: SortedBoxList.java & UnsortedBoxList.java. They should Extend BoxList.java.
 * The UnsortedBoxList should create a list as inputs are listed.
 * The sortedBoxList should sort the list according to volume
 * 
 * The GUI is the same as before. Left side shows unsorted list and right side shows sorted list.
 */

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project2
{	
	public static int totalSize;
	
	public static void main(String[] args) throws IOException
	{
		UnsortedBoxList ul = new UnsortedBoxList();
		SortedBoxList sl = new SortedBoxList();
		
		File file = new File("C:\\Users\\tahsi\\OneDrive\\Desktop\\input.txt");//Identifying file with proper path (Header: java.io.*)
		Scanner S = new Scanner(file);											//Scanner for scanning content from file (Header: java.util.*)
		
		int[] cd = new int[3];													//String array for String Tokenizer
		
		final BoxGUI GUI = new BoxGUI();										//Creating object BoxGUI
		
		if(S.equals(null))	
			throw new IllegalArgumentException("The list is null");				//throws exception if the input file is empty
		
		GUI.createAndShowBox();
		
		
		BoxList boxes = new UnsortedBoxList();
		
		while(S.hasNextLine())													//Loop runs while there is a next line
		{
			String a = S.nextLine();
			
			
			StringTokenizer st = new StringTokenizer(a, ",");					//splits line at delimiter ","(Header: java.util.StringTokenizer)
			int spaces = st.countTokens();
			
			for(int i=0; i<spaces; i++)
			{
				cd[i] = Integer.parseInt(st.nextToken());
			}
			
			ul.add(new Box(cd[0], cd[1], cd[2]));								//adding unsorted boxes to the list
			sl.add(new Box(cd[0], cd[1], cd[2]));								//adding sorted boxes to the list
			
			totalSize++;
		}
		
		//GUI.createAndShowBox();
		
		GUI.textArea1.setEditable(false);										//Sets the textArea uneditable
		GUI.textArea1.append("Unsorted List:\n");
		
		GUI.textArea2.setEditable(false);										//Sets the textArea uneditable
		GUI.textArea2.append("Sorted List:\n");									//Adds text to the textArea
		
		BoxNode tmp = ul.head;
		
		while(tmp != null)														//Loop for printing unsorted nodes
		{
			GUI.textArea1.append(tmp.data.toString());
			tmp = tmp.next;
		}
		
		BoxNode tmp2 =sl.head;													//Loop for printing sorted nodes
		
		while(tmp2 != null)
		{
			GUI.textArea2.append(tmp2.data.toString());
			tmp2 = tmp2.next;
		}
	}
}