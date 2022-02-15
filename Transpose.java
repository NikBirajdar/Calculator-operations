import java.lang.*;
import java.util.*;

public class Transpose
{
	public static void main(String args[])
	{       Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = s.nextInt();
		System.out.println("Enter the number of columns");
		int column = s.nextInt();
	
		int arr[][]= new int[row][column];
		System.out.println("Enter the elements of the array");
		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
				arr[i][j]= s.nextInt();
			
			
			}
		}
		System.out.println("Matrix BEFORE Transpose ");
		for(int p=0 ; p<row ; p++)
		{
			for(int q=0 ; q<column ; q++)
			{
				System.out.print(" "+arr[p][q]);
			
			
			}
			
			System.out.println();
		
		
		}
		
		System.out.println("Matrix AFTER Transpose ");
		for(int p=0 ; p<column ; p++)
		{
			for(int q=0 ; q<row ; q++)
			{
				System.out.print(" "+arr[q][p]);
			
			
			}
			
			System.out.println();
		
		
		}
		
	}


   }

