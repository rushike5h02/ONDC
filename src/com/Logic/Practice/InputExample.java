package com.Logic.Practice;

import java.io.FileInputStream;
import java.util.Scanner;

public class InputExample {
public static void main(String[] args) {
		
		try {
			
			FileInputStream fis= new FileInputStream("E:\\Output.txt");
		
			Scanner sc = new Scanner (fis);
			
			while(sc.hasNextLine());
			
			System.out.println(sc.nextLine());
		 sc.close();}
		
		 catch (Exception e) {
			 System.out.println(e);
		 }
		
		
	}

}
