import java.lang.*;
import java.util.*;


public class fibonacci
{
public static void main(String args[])
{
int n1=0,n2=1,n3,count;
Scanner s=new Scanner(System.in);
System.out.println("Enter the count..");
count= s.nextInt();

System.out.print(n1+" "+n2);   //printing 0 and 1    
for(int i=2;i<count;i++)
{
n3=n1+n2;
System.out.print(" "+n3);
n1=n2;
n2=n3;

}


}




}
