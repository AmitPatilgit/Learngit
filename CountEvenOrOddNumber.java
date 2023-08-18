package com.kn.arrays;

public class CountEvenOrOddNumber {

	public  void evenOrOddNumberInArray(int arr[])
	{
		//Method to Find Even Or Odd Number in Array
		int evenCounter=0,oddCounter=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCounter++;
			}
			else
			{
				oddCounter++;
			}
		}
		System.out.println("Total Even Elements in array is " + evenCounter );
		System.out.println("Total Odd Elemnets in array is  " + oddCounter);
	}

}
