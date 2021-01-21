package com.qa.main;

public class Results {

public static void DisplayResults() {
	
	int phys = 121;
	String message1 = "Physics:";
	System.out.println(message1);
	System.out.println(phys);

	int chem = 108;
	String message2 = "Chemistry:";
	System.out.println(message2);
	System.out.println(chem);
	
	int bio = 121;
	String message3 = "Physics:";
	System.out.println(message3);
	System.out.println(bio);
	
	int total = phys + chem + bio;
	String message4= "Total:";
	System.out.println(message4);
	System.out.println(total);
	
	int percent = (total * 100) / 450;
	String message5 = "Total Percentage:";
	System.out.println(message5);
	System.out.println(percent);
	
}
	
	
	
	public static void main(String[] args) {
		DisplayResults();
	}
}
