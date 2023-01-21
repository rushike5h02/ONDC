package com.Logic.Practice;

public class ArrayMinimum {

	public static void main(String[] args) {
		
		int arr [] = {10,20,40,30};

//		int min = arr [0];
//		
//		for (int i = 1; i<arr.length; i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//			
//		}
//		System.out.println("Minimum Element = "+min);
	
		
		int num=0;
		
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				num=arr[i];
			}
			System.out.println("Even Element = "+num);
		
			
			
		}
		
		
	}

}
