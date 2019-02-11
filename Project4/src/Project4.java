/**
 * Remove the linkedList from the previous project
 * 
 * Add hashmap and treemap. Note that hashMap takes input as in the file. TreeMap sorts the input by itself.
 * 
 * Show the unsorted list and the sorted list as before in a GUI. 
 */

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Project4 extends Box
{	
	public static HashMap<Integer, Box> unsorted;
	public static TreeMap<Integer, Box> sorted;
	
	public static void main(String[] args) throws IOException
	{
		unsorted = new HashMap<Integer, Box>();
		
		sorted = new TreeMap<Integer, Box>();
		
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
					Box b = new Box(cd[0], cd[1], cd[2]);
					unsorted.put(b.getVolume(), b);
					sorted.put(b.getVolume(), b);
					
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
		
		Set<Entry<Integer, Box>> set = unsorted.entrySet();
		Iterator<Entry<Integer, Box>> i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			GUI.textArea1.append(me.getValue() + "");
		}
		
		GUI.textArea2.setEditable(false);										//Sets the textArea uneditable
		GUI.textArea2.append("Valid sorted Box List:\n");
		
		Set<Entry<Integer, Box>> set2 = sorted.entrySet();
		Iterator j = set2.iterator();
		
		while(j.hasNext())
		{
			Map.Entry me2 = (Map.Entry)j.next();
			GUI.textArea2.append(me2.getValue() + "");
		}
	}
}