package com.kn.arrays;

import java.util.Scanner;

public class MergeOfTwoArrayDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//Array Declaration and Array Creation 
		System.out.println("Enter the size of the First Array : ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the size of the SEcond Array : ");
		int brr[] = new int [scan.nextInt()];
		
		
		
		
		//Array initialization 
		for(int i=0;i<arr.length;i++) {
				System.out.println("Enter "+ (i+1) +"Array Elements ");
				arr[i]=scan.nextInt();
				
		}
		for(int i=0;i<brr.length;i++) {
				System.out.println("Enter "+ (i+1) +"Array Elements ");
				brr[i]=scan.nextInt();
				
		}
		
		MergeOfTwoArray mergeArray=new MergeOfTwoArray();
		mergeArray.arraysMerge(arr,brr);
		
		
		scan.close();
	}

}
