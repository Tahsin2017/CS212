/**
 * Build a class Box. Box should have 3 parameters: length, width, height.
 * Set & get methods should be used to retrieve these parameters.
 * The input for length/width/height should be taken from an input file
 * Use StringTokenizer for taking inputs. The input is in "l,w,h" format. Use ',' as delimeter.
 * 
 * Build a GUI to show the inputs taken. Also show the volume of the boxes.
 * Use the toString method in Box.java to show the outputs
 * The GUI should have two sides. Left side shows the boxes in an unsorted manner(according to input serial).
 * Right side should show the Boxes in a sorted manner according to their volume.
 * 
 * You can use Array/ArrayList for this project
 *  
 */

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project1 
{
		
	public static void main(String[] args) throws IOException
	{
		int l=0,w=0,h=0;														//initializing the elements to get rid of errors
		
		File file = new File("C:\\Users\\tahsi\\OneDrive\\Desktop\\input.txt");	//Identifying file with proper path (Header: java.io.*)
		Scanner S = new Scanner(file);											//Scanner for scanning content from file (Header: java.util.*)
		
		String[] cd = new String[3];											//String array for String Tokenizer
		
		ArrayList<Box> boxes = new ArrayList<>();								//Arraylist for boxes
		BoxGUI GUI = new BoxGUI();												//Creating object BoxGUI
		
		if(S.equals(null))	
			throw new IllegalArgumentException("The list is null");				//throws exception if the input file is empty
		
		while(S.hasNextLine())													//Loop runs while there is a next line
		{
			String a = S.nextLine();
			
			StringTokenizer b = new StringTokenizer(a, ",");					//splits line at delimiter ","(Header: java.util.StringTokenizer)
			
			for(int i=0; i<3; i++)												//Loop for initializing length, width & height of box
			{
				cd[i] = b.nextToken();
				
				if(i==0)	l = Integer.parseInt(cd[0]);						//converts string>integer using parseInt
				if(i==1)	w = Integer.parseInt(cd[1]);
				if(i==2)	h = Integer.parseInt(cd[2]);
			}
			
			boxes.add(new Box(l,w,h));											//Adding new box using the dimensions from the loop
		}
		
		int[] v = new int[boxes.size()];										//Array for volume
		 
		GUI.textArea1.setEditable(false);										//Sets the textArea uneditable
		GUI.textArea1.append("Unsorted List:\n");								//Adds text to the textArea
	    
		for(int i=0; i<boxes.size(); i++)										//Loop for printing the unsorted list
		{
			v[i] = boxes.get(i).volume();
			int a = boxes.get(i).getLength();
			int b = boxes.get(i).getWidth();
			int c = boxes.get(i).getHeight();
			
			GUI.textArea1.append(boxes.get(i).toString(a,b,c,v[i])+"\n");		//Calls the toString method to print from class Box
		}
		
		doSelectionSort(v, boxes);												//Does the selection Sorting of both volume and arrayList
	    
	    GUI.textArea2.setEditable(false);
		GUI.textArea2.append("sorted List:\n");
	    
	    for(int i=0; i<boxes.size(); i++)
		{
			v[i] = boxes.get(i).volume();
			int a = boxes.get(i).getLength();
			int b = boxes.get(i).getWidth();
			int c = boxes.get(i).getHeight();
			
			GUI.textArea2.append(boxes.get(i).toString(a,b,c,v[i])+"\n");
		}
	    
	    GUI.createAndShowBox();													//To show the GUI window
	}
	
	public static void doSelectionSort(int[] arr, ArrayList<Box> list )
	{    
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            
            Collections.swap(list, i, index);								//Built in process for swapping arrayList(Header: java.util.*)
        }
    }
}
