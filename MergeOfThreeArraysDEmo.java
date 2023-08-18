package com.kn.arrays;

import java.util.Scanner;

public class MergeOfThreeArraysDEmo {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		//Array declaration and creation
		System.out.println("Enter the Size of the first Array : ");
		int arr[]= new int [scan.nextInt()];
		System.out.println("Enter the size of the Second Array : ");
		int brr [] = new int [scan.nextInt()];
		System.out.println("Enter the size of the Third Array : ");
		int drr [] = new int [scan.nextInt()];
		
		
		//
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the " + (i+1) + " Array Element of First array : ");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.println("Enter the " +(i+1) + " Array Elements of the Second Array : " );
			brr[i]=scan.nextInt();
		}
		for(int i=0;i<drr.length;i++)
		{
			System.out.println("Enter the " +(i+1) + " Array Elements of the Third Array : " );
			drr[i]=scan.nextInt();
		}
		
		
		//
		
				MergeOfThreeArrays mergeArray = new MergeOfThreeArrays();
				mergeArray.printMergedArray(arr,brr,drr);
		
		scan.close();

	}

}
