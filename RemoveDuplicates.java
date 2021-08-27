package rem.hw;

import java.util.*;

public class RemoveDuplicates {
	
	public static void main(String args[]) {
		
		String str = "PayPal India";
		System.out.println("String : "+str);
		String str1=str.toLowerCase();
		System.out.println(str1);
		String str2=str1.replaceAll(" ","");
		System.out.println(str2);
		
		char charc[]=str2.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		for(char eachChar :charc)
		{
			boolean add=charSet.add(eachChar);
			if(add==false)
			{
				dupCharSet.add(eachChar);
			}
		}
		System.out.println("Duplicate character:" + dupCharSet);
		charSet.removeAll(dupCharSet);
		System.out.println("Character:" + charSet);
		for(Character letters :charSet)
		{
			System.out.println(letters );
		}
		

	}
		
		
		
		
	}
	
	


