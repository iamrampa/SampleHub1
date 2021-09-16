package lti.testing;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

class InvalidException extends Exception
{
	InvalidException(String msg)
	{
		super(msg);
	}
	
}

public class ArrayWork {
	
	public int[] work(int[] input) throws InvalidException
	{
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==0||input[i]<0)
				throw new InvalidException("Invalid Exception");
		}
			
		LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>();
		for(int i=0;i<input.length;i++)
			h1.add(input[i]);
		int[] arr=new int[h1.size()];
		int k=0,j=0,m=0;
		Iterator<Integer> itr=h1.iterator();
		while(itr.hasNext())
		{
			k=(int)itr.next();
			//System.out.println(k);
			arr[j]=k;
			//System.out.println(arr[j]);
			j++;
		}
		Arrays.sort(arr);
		int arr1[]=new int[h1.size()];
		for(int i=h1.size()-1;i>=0;i--)
			arr1[m++]=arr[i];
		return  arr1;
	 
	}


}
