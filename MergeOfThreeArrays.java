package com.kn.arrays;

public class MergeOfThreeArrays {

	public  void printMergedArray (int []arr,int[] brr,int[] drr )
	//method to merge the three arrays
		
	{
		System.out.println("*************************************");
		System.out.println("The Merged Elements are as Follows : ");
		
		int crr[] = new int[arr.length+brr.length+drr.length];
		for(int i=0;i<arr.length;i++) 
		 {	
			crr[i]=arr[i];
			System.out.print(crr[i]+" ");
			
		 }
		
		for(int i=0;i <brr.length;i++) 
		{
			crr[arr.length+i]=brr[i];
			System.out.print(crr[arr.length+i]+ " ");
		}
		
		for(int i=0;i<drr.length;i++)
		{
			crr[arr.length + brr.length + i] = drr[i];
			System.out.print(crr[arr.length + brr.length + i]+" ");
		}

	}

}
