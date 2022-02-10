import java.lang.*;
import java.util.*;
import java.util.Scanner.*;

public class Calc
{
	public static void main(String args[])
	{	
		double num1,num2;
 		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of num1 and num2");
		num1=s.nextDouble();
		num2=s.nextDouble();
                
                System.out.println("The entered values are :"+num1+ "and"+num2);
                
                System.out.println("///////..CALCULATOR OPERATIONS..\\\\\\\\");
                System.out.println("Choose the operation:");
                System.out.println("ADDITION: + ");
                System.out.println("SUBTRACTION: - ");
                System.out.println("DIVISION: /");
                System.out.println("MULTIPLICATION: *");
                
                
                char operator = s.next().charAt(0);
                s.close();
                double result=0;
                
                switch(operator)
                {
                	case '+':
                	     result = num1+num2;
                	     break;
                	     
                	case '-':
                	     result = num1-num2;
                	     break;
                	     
                	case '/':
                	      result = num1/num2;
                              break;
                              
                        case '*':
                              result= num1*num2;
                              
                         
            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             * 
             */
                        default:
                              System.out.println("KINDLY ENTER A VALID OPERATOR!!");
                              
                             }       
                 System.out.println(num1+" "+operator+" "+num2+": "+result);
                
                
                
                }

}

































