import java.lang.*;
import java.util.*;

public class Arraylist
{
	public static void main(String args[])
	{
		List<Integer> elem = new ArrayList<>();
		
		elem.add(10);
		elem.add(22);
		elem.add(3);
		elem.add(11);
		elem.add(99);
		
		System.out.println(elem);
		
		elem.remove(2);  // Removes element at index 2, i.e. 3
		elem.remove(4);  // Removes element at index 4, i.e. 99
	
	
	
	
		System.out.println("After removing elements..");
		System.out.println(elem);
	
	
	
	}






}
