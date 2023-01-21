package com.Airtel.CustomerService.mobileservice;

import java.util.Scanner;

public class CallClass {

	public static void main(String[] args) {
		
		CheckPackage call=new CheckPackage();
		
		call.airtel();
		 
		Scanner callagain=new Scanner(System.in);
		
		int nine=callagain.nextInt();
		
		if(nine==9) {
		call.airtel();
		}
		else
			System.out.println("Sorry, We did not undestood your response");
		
		
		System.out.println("Thank You for calling Airtel");

	}

}
