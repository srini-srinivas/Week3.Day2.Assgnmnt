package rem.hw;

import java.util.*;


public class ArrList {
	
	public static void main(String args[])
	{
		ArrayList lst = new ArrayList();
		lst.add("Aspire System");
		lst.add("cts");
		lst.add("wipro");
		lst.add("hcl");
		System.out.println("The array list contains : "+lst);
		System.out.println("The size of the array : "+lst.size());
		Collections.sort(lst);
		System.out.println("The sort of the list : "+lst);
		Collections.reverse(lst);
		System.out.println("The reverse of the list : "+lst);
		

		
	}


}
