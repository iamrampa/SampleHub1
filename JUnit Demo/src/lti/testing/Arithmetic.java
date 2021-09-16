package lti.testing;
import java.util.*;
public class Arithmetic {
	
	

	public int[] remDeps(int[] input)
	{
		LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>();
		for(int i=0;i<input.length;i++)
			h1.add(input[i]);
		int[] arr=new int[h1.size()];
		int k=0,j=0;
		Iterator<Integer> itr=h1.iterator();
		while(itr.hasNext())
		{
			k=(int)itr.next();
			//System.out.println(k);
			arr[j]=k;
			//System.out.println(arr[j]);
			j++;
		}
		return  arr;
	 
	}

}
