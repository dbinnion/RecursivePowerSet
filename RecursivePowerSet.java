package TreeTraversalandRecursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RecursivePowerSet {
	public static void main (String [] args)
	{	
		for(String s:PowerSet("abc"))
		{
			System.out.println(s);
		}
		
	}
	public static Set<String> PowerSet(String input)
	{	//for series of characters,
		//powerset is union of all powersets of size >= that series
		//so remove one element and get the powerset of that, then remove the next
		//ie. powerset of {1,2} is {1,2} + powerset of 1 + powerset of 2
		Set<String> output = new HashSet<String>(Arrays.asList(new String[]{input}));
		for(int i=0;i<input.length();i++)
		{
			String substring = input.substring(0, i)+input.substring(i+1);
			output.addAll(PowerSet(substring));
		}
		return output;
	}
}
