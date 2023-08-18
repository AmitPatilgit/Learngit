package com.kn.arrays;

public class SumOfArrayElements {

	public  int calculateSumOfArray(int arr[]) 
	{
		//Method to print sum Of Array Elements
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		return sum;
		

	}

}
