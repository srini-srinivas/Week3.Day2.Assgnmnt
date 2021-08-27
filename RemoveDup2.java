package rem.hw;

import java.util.*;

public class RemoveDup2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenText = "We learn java basics as part of java sessions in java week1";	
		String[] str = givenText.split(" ");
		Set<String> Str1 = new LinkedHashSet<String>();
		for(String str2 : str )
		{
			Str1.add(str2);
		}
		for(String str3 :Str1)
		{
			System.out.print(str3+ " ");
		}
	}


}
