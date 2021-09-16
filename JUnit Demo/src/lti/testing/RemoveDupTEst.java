package lti.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RemoveDupTEst {

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
		
		assertArrayEquals(arr3,ar2);
	}

	

	@Test
	public void myProgramtest9() {
		try {
			
		ArrayWork ar=new ArrayWork();
		int ar1[]= {10,20,20};
		int ar2[]= {20,10};
		int[] arr3=ar.work(ar1);
		assertArrayEquals(arr3,ar2);
		}
		catch(Exception e) {
			fail("wrong answer");
		}
		
	}

	@Test
	public void myProgramtest_1() {
		try {
			
		ArrayWork ar=new ArrayWork();
		int ar1[]= {1,2,3,0};
		int ar2[]= {3,2,1};
		int[] arr3=ar.work(ar1);
		assertArrayEquals(arr3,ar2);
		}
		catch(Exception e) {
			assertEquals(e.getMessage(),"Invalid Exception");
		}
		
	}
	


}
