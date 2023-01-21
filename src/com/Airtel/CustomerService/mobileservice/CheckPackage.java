package com.Airtel.CustomerService.mobileservice;

import java.util.Scanner;

public class CheckPackage {
		private int balance = 500;
		
public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		
public void airtel() {	
		
		System.out.println("Welcome to Airtel");
		System.out.println("For Wallet Details Press 0=");
		System.out.println("For Prepaid Pack Press 1=");
		System.out.println("For Post-Paid Pak Press 2=");
		System.out.println("For Caller Tune Press 3=");
		System.out.println("For Roaming Pack Press 4=");
		System.out.println("For International Calls Press 5=");

		
		int i= getBalance();
		
		Scanner press=new Scanner(System.in);
		
		System.out.println("Your Choice = ");
		
		int button=press.nextInt();
		
		switch(button) {
		
		case 0:
			System.out.println("Amount in Your Walllet is = " +getBalance());
			break;
		case 1:
			System.out.println("Following is list for Preapaid Pack");
			
			Scanner one=new Scanner(System.in);
			
			System.out.println("Press 1 for Rs. 10");
			System.out.println("Press 2 for Rs. 20");
			System.out.println("Press 3 for Rs. 50");
			System.out.println("Press 4 for Rs. 100");
			System.out.println("Press 5 for Rs. 149");
			System.out.println("Press 6 for Rs. 199");
			
			System.out.println("Your Choice = ");
			
			int key=one.nextInt();
			
			
			switch(key) {
			case 1:
				System.out.println("Recharged Succesfully for Rs. 10");
				System.out.println("Amount in Wallet = " + (i-10));
				break;
			case 2:
				System.out.println("Recharged Succesfully for Rs. 20");
				System.out.println("Amount in Wallet = " + (i-20));
				break;
			case 3:
				System.out.println("Recharged Succesfully for Rs. 50");
				System.out.println("Amount in Wallet = " + (i-50));
				break;
			case 4:
				System.out.println("Recharged Succesfully for Rs. 100");
				System.out.println("Amount in Wallet = " + (i-100));
				break;
			case 5:
				System.out.println("Recharged Succesfully for Rs. 149");
				System.out.println("Amount in Wallet = " + (i-149));
				break;
			case 6:
				System.out.println("Recharged Succesfully for Rs. 199");
				System.out.println("Amount in Wallet = " + (i-199));
				break;
				default:
					System.out.println("Sorry, We did not understand your response");
			}
			
			break;
		case 2:
			System.out.println("You Dont have Post-Paid Sim");
			System.out.println("Press 1 Convert Pre-Paid to Post-Paid Sim");
			System.out.println("Charges Of Conversion Rs. 199");
			
			Scanner scpost = new Scanner(System.in);
			int post = scpost.nextInt();
			switch(post) {
		
			case 1:
				System.out.println("Conversion To Post-Paid Succesfully");
				System.out.println("Wallet Balance = "+(i-199));
			break;
			default:
				System.out.println("Sorry, We did not understand your response");
		}
			
			break;
		case 3:
			System.out.println("For your favourite Caller Tune Press");
			break;
		case 4:
			System.out.println("For All India Roaming Free recharge with Rs.150");
		    break;
		case 5:
			System.out.println("For unlimited International Call recharge Rs 2500");
			break;
			
		default:
				System.out.println("Sorry, we did not understand your response");
				
				Scanner returnTo=new Scanner(System.in);
				
				System.out.println("To hear Again Press 9");
				

		}				
		
}
		public static void main(String[] args) {                      // main method
		
			CheckPackage checkpackage= new CheckPackage();
			checkpackage.airtel();
			
			Scanner callagain=new Scanner(System.in);
			
			int nine=callagain.nextInt() ;
			
			if(nine==9) {
			checkpackage.airtel();
			}
			else
				System.out.println("Sorry, We did not undestood your response");
			
			
			System.out.println("Thank You for calling Airtel");
			
	}
	
}