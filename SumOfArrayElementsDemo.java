package com.kn.arrays;

import java.util.Scanner;

public class SumOfArrayElementsDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//Array Declaration and Array Creation
		System.out.println("Enter the Size of the Array : ");
		int [] arr=new int[scan.nextInt()];
		
		//Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the" +(i+1)+  " Elements : ");
			arr[i]=scan.nextInt();
		}
		
		//Create the Object of 
		SumOfArrayElements printSumOfArray = new SumOfArrayElements();
		
		//call the method calculateSumOfArrayElements
		System.out.println("The sum of the Array Elements =" + printSumOfArray.calculateSumOfArray(arr));
		
		scan.close();
	}

}
