package com.Logic.Practice;



public class SelectiveTable {

	//...Write a java program to print the all multiplication table from * 2, 4, 6, 8,10, 12.... to 20
	
public void multiplicationTable() {
		
		for(int x=2; x<=20; x++) {
			
			if(x%2==0) {
			
			System.out.println("Table of "+x+"=");
			System.out.println();
			
			for(int i=1; i<=10; i++) {
				
				int result = x*i;
				
				System.out.println(result + " \t ");			
			}
			System.out.println();			
		
		}
		}
	}	
	
	
	public static void main(String[] args) {
		
		SelectiveTable table = new SelectiveTable();
		
		table.multiplicationTable();
		

	}

}
