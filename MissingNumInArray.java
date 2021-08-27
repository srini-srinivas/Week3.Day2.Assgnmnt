package rem.hw;

import java.util.*;

public class MissingNumInArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,7,6,8};
		Arrays.sort(array);
		List<Integer> list = new ArrayList<Integer>();
		for(Integer array1 :array)
		{
			list.add(array1);
		}
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)!=i+1)
			{
				System.out.println("Missing Element:" + (i+1));
				break;
			}
		}
		
	}

}
