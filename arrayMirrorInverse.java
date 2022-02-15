import java.lang.*;
import java.util.*;

public class Mirrorinverse
{
	static boolean isMirror(int arr[])
	{    
		 
	      for(int i=0 ; i<arr.length ; i++)
	     {
	     	if(arr[arr[i]] != i)
		{
		 	return false;
		}
	      }
	       return true;
	} 

public static void main(String args[])
	{       int arr[];
		arr=new int[6];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the array elements..");
		for(int i =0; i<arr.length ; i++)
		{
			arr[i] = s.nextInt();	
		
		}
		if(isMirror(arr))
		{
			System.out.println("YES! the entered array can mirror inversed");
		
		}
		else
		{
			System.out.println("NO! the entered array CAN NOT BE mirror inversed");
		
		
		}
	
	
	
	
	
	
	
	} 
	
	
	
	
	
	


}






