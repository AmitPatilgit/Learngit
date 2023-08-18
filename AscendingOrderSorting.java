package com.kn.arrays;

public class AscendingOrderSorting {

	public  void sortAscendingOrder(int[] arr) 
	{
		//Method to print the Sorted array
		int temp;
		System.out.println("Before Sorting ");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.length-1;i++)
		{
			boolean isSwapped=false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				//Swap of the number
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
				
			}
			if(isSwapped==false)
			{
				break;
			}
			
		}
		System.out.println("");
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
