package com.Logic.Practice;

public class PallindromeString {

	public static void main(String[] args) {
		String str = "TENET";
		String rev =  " ";
		char ch;
		String temp;
		temp=str;
		
		for (int i= str.length()-1; i>=0; i--) {
			
		ch= str.charAt(i);
		rev = rev + ch;
		}
//		System.out.println(rev);
		
//		if(str.toLowerCase().equals(rev.toLowerCase())) {
//          System.out.println(str + " String is a Palindrome");
//		}
//		else {
//			System.out.println(str +" String is Not Palindrome");
//		}
		
		if(temp==str) {
			System.out.println(str + " String is a Palindrome");
		}
		else {
			System.out.println(str +" String is Not Palindrome");
		}
		
		
	}
}
