package com.Logic.Practice;

public class ArraySumOfElement {
public static void main(String[] args) {
		
		//write a program for below array to print element if sum of two element is 50
		
		int [] array = {10,30,20,40,50,60,60,40,30,50};
		
		for(int i = 0 ; i<array.length-1 ; i++) {
			for(int j = i+1; i<array.length ; i++) {
				if(array[i] + array[j] == 50) {
				
//				if(array[i]==array[j]) {   	// duplicate element
					System.out.println("sum of given element is 50  ="+ array[i] +"  " +"  "+ array[j]);
				}
			}
			
		}
		
		
	
	
	}

}
