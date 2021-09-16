package lti.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MyProgramTest {

	@Test
	public void myProgramtest1() {
		MyProgram mp=new MyProgram();
		String res=mp.makeUpper("ram");
		assertEquals("RAM",res);
	}
	@Test
	public void myProgramtest2() {
		MyProgram mp=new MyProgram();
		String res=mp.makeUpper("FReed");
		assertEquals("FREED",res);
	}
	@Test
	public void myProgramtest3() {
		MyProgram mp=new MyProgram();
		String res=mp.makeUpper("KAIT");
		assertEquals("KAIT",res);
	}
	@Test
	public void myProgramtest4() {
		MyProgram mp=new MyProgram();
		int res=0;
		try {
			res=mp.divide(10, 0);
		}
		catch(Exception e)
		{
			fail("Exception Occured");
		}
		assertEquals(res,-1);
	}
	
	@Test
	public void myProgramtest5() {
		Arithmetic ar=new Arithmetic();
		int ar1[]= {10,20,20,30,30};
		int ar2[]= {10,20,30};
		int arr3[]=ar.remDeps(ar1);
		
		Arrays.equals(arr3,ar2);
	}
	@Test
	public void myProgramtest6() {
		Arithmetic ar=new Arithmetic();
		int ar1[]= {9,9,1,2,3};
		int ar2[]= {9,1,2,3};
		int[] arr3=ar.remDeps(ar1);
		
		Arrays.equals(arr3,ar2);
	}
	@Test
	public void myProgramtest7() {
		Arithmetic ar=new Arithmetic();
		int ar1[]= {1,2,3,4};
		int ar2[]= {1,2,3,4};
		int[] arr3=ar.remDeps(ar1);
		
		Arrays.equals(arr3,ar2);
	}
	


}
