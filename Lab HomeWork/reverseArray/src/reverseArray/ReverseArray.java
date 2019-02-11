/**
 * Reverse and array using recursion
 * 
 * Find the max value using recursion
 */

package reverseArray;

public class ReverseArray 
{	
	public static void main(String[] args)
	{
		int[] array = {60,70,81,14};	//Array for reversing
		
		int i=0;
		int j= array.length-1;
		int max = array[0];
		
		max(array, i, j, max);
		reverseArray(array, i, j);	//calling the reverseArray method
	}
	
	public static void reverseArray(int[] array, int i, int j)
	{	
		//swapping values
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
		i++; j--;
		
				
		if(i >= array.length/2)	//if i++ becomes equal/ greater than half of the array length, print solution
		{
			for(int x : array)
			{
				System.out.println(x);
			}
			System.exit(0);	//for exiting the program after printing the array
		}
		
		reverseArray(array, i, j);	//Recursion	
	}
	
	public static void max(int[] array, int i, int j, int max)
	{	
		i++;
		
		if(array[i]>max)
			max = array[i];
		
		if(i < j)	max(array, i, j, max);
		
		if(i==j)
			System.out.println("max: " + max);
			
	}	
}
