package com.Logic.Practice;

import java.util.Scanner;

//  enter a number and print sum of its digit


public class SumOfDigits {

	public static void main(String[] args) {
		
     int r, sum=0, temp;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter The Number=");
     int n=sc.nextInt();
     
     temp=n;
     
     while(n>0) {
    	 
    	r=n%10;
    	sum=sum+r;
    	n=n/10;
     }
     
		System.out.println("Sum of Digits in no."+temp+"====="+sum);
		
	}

}

