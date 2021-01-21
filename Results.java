package com.qa.main;

public class Results {

	public static void DisplayResults() {

		int phys = 90;
		String message1 = "Physics:";
		System.out.println(message1);
		System.out.println(phys);

		int chem = 90;
		String message2 = "Chemistry:";
		System.out.println(message2);
		System.out.println(chem);

		int bio = 89;
		String message3 = "Physics:";
		System.out.println(message3);
		System.out.println(bio);

		int total = phys + chem + bio;
		String message4 = "Total:";
		System.out.println(message4);
		System.out.println(total);

		int percent = (total * 100) / 450;
		String message5 = "Total Percentage:";
		System.out.println(message5);
		System.out.println(percent);
		
		if(percent < 60) {
			System.out.println("Pass Mark: FAIL "
					+ "Reason: Total grade did not surpass 60%");
		}
		else if((phys * 100) / 150 < 60) {
			System.out.println("Pass Mark: FAIL "
					+ "Reason: Physics grade did not surpass 60%");
		}
		else if((chem * 100) / 150 < 60) {
			System.out.println("Pass Mark: FAIL "
					+ "Reason: Chemistry grade did not surpass 60%");
		}
		else if((bio * 100) / 150 < 60) {
			System.out.println("Pass Mark: FAIL "
					+ "Reason: Biology grade did not surpass 60%");
		}
		else {
			System.out.println("Pass Mark: PASS");
		}
	}

	public static void main(String[] args) {
		DisplayResults();
	}
}
