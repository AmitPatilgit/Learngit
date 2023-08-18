package com.kn.arrays;

public class SelectionSort {

	public int [] selction(int arr[])
	{
		//Method to sort Array in ascending order by using Selection Sort
		System.out.println("Array elements before Sorting are");
		for(int i:arr)
		{
			System.out.print(i+ " ");
		}
		int min,index=0; 
		
		for(int i=0;i<arr.length;i++)
		{
			
			min=arr[i];
			index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					index=j;
				}
			}
			//Swapping element logic with minimum value
			int temp=arr[i];
			arr[i]=min;
			arr[index]=temp;
		}
		return arr;
		

	}

}
