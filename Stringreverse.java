import java.lang.*;
import java.util.*;

public class Stringre
{

	public static void main(String args[])
	{
	
		String str1,str2=" ";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string..");
		str1=s.nextLine();
		System.out.println();
		System.out.println("Entered String is .."+ str1);
		System.out.println("/////Reversing...////");
		
		for(int i=str1.length()-1 ; i>=0 ; i--)
		{
			str2 = str2 + str1.charAt(i) + " " ; 
		
		
		
		}
		System.out.println();
		System.out.println(str2);
	
	
	
	
	}




}
