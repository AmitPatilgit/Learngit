package com.kn.arrays;

public class MergeOfTwoArray {

	public  void arraysMerge(int arr[] ,int brr[]) 
	{
		int crr[] =new int [arr.length+brr.length];
		//Method to Merge two Arrays arr & brr
		System.out.println("********************");
		System.out.println("The Following are the Merged Elements ");
		
		for(int i=0;i<arr.length;i++) 
		 {	
			crr[i]=arr[i];
			System.out.println(crr[i]+" ");
			
		 }
		
		for(int i=0;i <brr.length;i++) 
		{
			crr[arr.length+i]=brr[i];
			System.out.println(crr[arr.length+i]+ " ");
		}
		
		
		
		
		
		

	}

}
