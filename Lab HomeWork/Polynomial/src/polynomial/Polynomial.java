/**
 * Write a program for finding sum of the polynomial f(x) = ax^2 + bx + c 
 * 
 *  The coefficients should be provided using an array
 *  
 *  Depending on how many coefficients are there, the maximum power of x should be decided
 *  
 *  Value of x will be provided
 *  
 *  Print only the sum of the equation
 */

package polynomial;

public class Polynomial 
{
    public static void print(Object o)
    {
    	System.out.println(o);
    }
    
    public static void main(String[] args)
    {
    	int total =0;	//initializing sum 	
        int x=7;	//value of variable x
        int[] n = {1,2,3,4,5};	//coefficient array
    	
    	for(int i = 0; i < n.length; i++)
    	{
    		int product=1;	
    		
    		for(int j = 0; j < n.length-i-1; j++)
    		{
    			product *= x;	//finding product of x^sth.
    		}
    		total = total + n[i]*product;	//finding and adding coeff*x^sth
    	}
    	
    	print(total);
    }
}
