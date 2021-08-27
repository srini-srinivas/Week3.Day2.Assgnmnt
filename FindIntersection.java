package rem.hw;

import java.util.*;

public class FindIntersection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]={3,2,11,4,6,7};
		int array2[]= {1,2,8,4,9,7};
		List<Integer> firstArray=new ArrayList<Integer>();
		for(int i:array1)
			firstArray.add(i);
		
		List<Integer> SecondArray=new ArrayList<Integer>();
		for(int j:array2)
			SecondArray.add(j);
		firstArray.retainAll(SecondArray);
		
		for(int num:firstArray)
		System.out.println(num);

	}

}
