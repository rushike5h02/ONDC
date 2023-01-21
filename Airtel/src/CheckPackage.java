import java.util.Scanner;

public class CheckPackage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Airtel");
		System.out.println("For Existing Pack Details Press 0=");
		System.out.println("For Prepaid Pack Press 1=");
		System.out.println("For Post-Paid Pak Press 2=");
		System.out.println("For Caller Tune Press 3=");
		System.out.println("For Roaming Pack Press 4=");
		System.out.println("For International Calls Press 5=");

		Scanner press=new Scanner(System.in);
		
		System.out.println("Your Choice=");
		
		int button=press.nextInt();
		
		switch(button) {
		
		case 0:
			System.out.println("Your Account Balance is Rs. 1.25, you are BROKE");
			break;
		case 1:
			System.out.println("Following is list for Preapaid Pack");
			
			Scanner one=new Scanner(System.in);
			
			System.out.println("Press 1 for Rs. 10");
			System.out.println("Press 2 for Rs. 20");
			System.out.println("Press 3 for Rs. 50");
			
			System.out.println("Your Choice");
			
			int key=one.nextInt();
			
			switch(key) {
			case 1:
				System.out.println("Recharged Succesfully for Rs. 10");
				break;
			case 2:
				System.out.println("Recharged Succesfully for Rs. 20");
				break;
			case 3:
				System.out.println("Recharged Succesfully for Rs. 50");
				break;
				default:
					System.out.println("Sorry, We did not understand your response");
			}
			
			break;
		case 2:
			System.out.println("You Dont have Post-Paid Sim");
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
				
			int returnTo1=press.nextInt();
			
			System.out.println("Call Again");
     
     
		}
		
	}
	
}