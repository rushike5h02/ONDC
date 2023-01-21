package com.Logic.Practice;

public class StringCharacters {

	public static void main(String[] args) {
		
		
		String str = "This@is#example&of<string";
	
		str = str.replaceAll("\\W", " ");
	
//		str = str.replace("@", " ");
		
//		str = str.replaceAll("[@#&]", " ");
		
		System.out.println(str);
		
		str = str.replace(" is", " was");
		System.out.println(str);
		
		String newstr = str.replaceAll(" ", "12");
		System.out.println(newstr);

	}

}
