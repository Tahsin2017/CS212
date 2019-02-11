/**
 * Write a program for multiplying two matrices.
 * 
 * If the multiplication is not possible, exit the program.
 * 
 * Print the product matrix in an organized format
 */

package matrixMultiplication;

public class MatrixMultiplication 
{
	public static void main(String[] args)
	{
		int[][] matrix1= {{1,0,0,0},
						  {0,1,0,0},
						  {0,0,1,0},
						  {0,0,0,1}};
		
		int[][] matrix2 = {{9,8,7,6},
						   {6,5,4,3},
				           {3,2,1,0},
				           {1,2,3,4}};
		
		if(matrix1[0].length != matrix2.length)
		{
			System.out.println("This matrix multiplication is undefined");
			System.exit(0);
		}
		
		
		for(int i=0; i<matrix1.length; i++)	// i is for keeping the row of 1st matrix constant till its needed
		{	
			for(int j=0; j<matrix1[i].length; j++)	// j is for keeping the column of the 2nd matrix constant till its needed
			{
				int sum=0;							//sum is for storing the sum of products of elements
				
				for(int k=0; k<matrix1[i].length; k++)	// k is used for changing row of 1st matrix and column of 2nd matrix
				{
					sum += matrix1[i][k] * matrix2[k][j];
				}
				
				System.out.print(sum + "\t");
			}
			
			System.out.println();
		}
	}
}
