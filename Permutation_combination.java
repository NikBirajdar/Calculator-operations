import java.lang.*;
import java.util.*;

class Per
{
	double factorial(double num)
	{
		int i=1;
		double fact=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		
		}
		return fact;
	}
	 double permutation(int num,int r)
	{
	
		double per=factorial(num)/factorial(num-r);
		return per;
	
	}
	 double combination(int num,int r)
	{
		double com=factorial(num)/(factorial(r)*factorial(num-r));
		return com;
	}
	
	
	
	
 public static void main(String args[])
 {
 	Per s=new Per();
 	Scanner p=new Scanner(System.in);
 	System.out.println("Enter value of num");
        int num=p.nextInt();
	System.out.println("Enter value of r");
       	int r=p.nextInt();
	if(num>=r)
	{
		System.out.println("The value of "+num+"p"+r+" is : "+s.permutation(num,r));	
		System.out.println("The value of "+num+"c"+r+" is : "+s.combination(num,r));
		
	}
	else
	{
		System.out.println("n value should be greater than or equals to r value");
 
 	}
 
 
 
 
 
 }







}
