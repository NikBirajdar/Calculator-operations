import java.lang.*;
import java.util.*;

public class factorial
{
public static void main(String args[])
{
	int num,fact=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number for calculating factorial");
	num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	
	
	}
	System.out.println("Factorial of "+ num +"is "+fact);


}






}
