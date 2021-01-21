package com.qa.main;

public class Calc {

	public static void Addition() {
		int num1 = 5;
		int num2 = 7;

		int res1 = num1 + num2;
		System.out.println(res1);
	}

	public static void Subtraction() {
		int num3 = 12;
		int num4 = 9;

		int res2 = num3 - num4;
		System.out.println(res2);
	}

	public static void Multiplication() {
		int num5 = 15;
		int num6 = 8;

		int res3 = num5 * num6;
		System.out.println(res3);
	}

	public static void Division() {
		int num7 = 25;
		int num8 = 5;

		int res4 = num7 / num8;
		
		if(num7 > num8) {
			System.out.println(res4);
			}
		else {System.out.println("Invalid input");
			}
	}

	public static void main(String[] args) {
		Addition();
		Subtraction();
		Multiplication();
		Division();
	}

}
