import java.lang.*;
import java.util.*;

public class Pattern
{
	public static void main(String args[])
	{
		int row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows you want in the pattern...");
		row = s.nextInt();
		for(int i=1; i<row ; i++)
		{   
			for(int j=i; j<=row ; j++ )
			{
				System.out.print("  ");		
			
			}
			
				for(int k=1; k<i; k++)
				{
					System.out.print("* ");
				
				
				}		
					for(int k=1; k<=i ; k++)
					{
						System.out.print("* ");
					
					
					
					}
			
			System.out.println();
			}
			
			
		
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("  ");
			
			
			}
			for(int k=i ; k<row ; k++)
			{
				System.out.print("* ");
				
			}
			for(int k=i; k<=row ; k++)
			{
			
				System.out.print("* ");	
			
			}
		
		
		System.out.println();
		
		}
	}			
		
}	



