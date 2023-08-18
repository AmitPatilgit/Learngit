package com.kn.arrays;
import java.util.Scanner;

public class SelectionSortDemo {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		//Array Declartion  and  creation
		System.out.println("Enter the size of the Array : ");
		int [] arr=new int[scan.nextInt()];
		//intialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the " + (i+1)  + " ELement in the Aray :");
			arr[i]= scan.nextInt();
		}
		
		
		//Object Creation
		
		SelectionSort sort = new SelectionSort();
		//Calling Behavior
		sort.selction(arr);
		
		
		
		System.out.println();
		System.out.println("Sorted array elements are");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+ " ");
		}
		scan.close();
	}

}
