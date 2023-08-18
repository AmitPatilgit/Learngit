package com.kn.arrays;

public class ArrayBackwardTraversing {

	public void printReverseArraryElements(int[ ] arr) 
	{
		//Method to Print Array Elements in Reverse Order
		System.out.println("*******************");
		System.out.println("The Array Elements are as Follows : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i] + " ");
		}

	}

}
