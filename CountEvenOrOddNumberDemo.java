package com.kn.arrays;

import java.util.Scanner;

public class CountEvenOrOddNumberDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		// Array Declaration and Creation
		System.out.println("Enter the Size of the Array =");
		int arr[] =new int[scan.nextInt()];
		
		//Array Initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter " + (i+1) +   " Array Element");
			arr[i]=scan.nextInt();
		}
		
		//Create the Object for CountEvenOrOddNumber
		CountEvenOrOddNumber countEvenOrOddInArray = new CountEvenOrOddNumber();
		//call the method evenOrOddNumberInArray
		countEvenOrOddInArray.evenOrOddNumberInArray(arr);

		scan.close();
	}

}
