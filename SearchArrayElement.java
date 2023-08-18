package com.kn.arrays;

public class SearchArrayElement {

	public  void binarySearch(int[] arr,int element)
	
	{	//int element=0;
		
		int low=0,high=arr.length,position=-1;
		boolean isElementFound = false;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(element==arr[mid])
			{
				isElementFound=true;
				position=mid+1;
				break;
			}
			else if(element>arr[mid])
			{
				low=mid+1;
				//high=high;
			}
			else
			{
				high=mid-1;
				//low=low;
			}
		}
		if(isElementFound)
		{
			System.out.println("The Element " + element + " is found at " + position + " position");
		}
		else
		{
			System.out.println("The Element " + element + " is not found" );
		}

	}

}
