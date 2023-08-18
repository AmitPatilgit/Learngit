package com.kn.arrays;

import java.util.Scanner;

public class AscendingOrderSortingDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//Array Declaration and Creation
		System.out.println("Enter Array Size ");
		int[] arr=new int[scan.nextInt()];
		//Array Initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+" element of an Array ");
			arr[i]=scan.nextInt();
		}
		//Create an Object to Sort the given Array
		AscendingOrderSorting sort = new AscendingOrderSorting();
		sort.sortAscendingOrder(arr);
		scan.close();

	}

}
