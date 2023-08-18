package com.kn.arrays;

import java.util.Scanner;

public class SearchArrayElementDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//Array Declaration and Creation
		System.out.println("Enter the size of Array :");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter the Element to search in array : ");
		int element = scan.nextInt();
		//Array Initialization
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the " + (i+1) + " Array Element ");
			arr[i]=scan.nextInt();
		}
		
		//Create an Object for Finding the elemnent in array
		
		
		
		
		SearchArrayElement elementFound=new SearchArrayElement();
		elementFound.binarySearch(arr,element);
		
		
		scan.close();
		
	}
}
