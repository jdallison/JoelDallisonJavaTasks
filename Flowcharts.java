package com.qa.main;

public class Flowcharts {

	public static void Input() {

		int num1 = 5;
		int num2 = 12;
		boolean bool = false;
		int input = 0;

		if (bool == true) {
			input = num1 + num2;
		} else if (bool == false) {
			input = num1 * num2;
		}
		System.out.println(input);
	}

	public static void Chart() {

		int A = 3000;

		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
			}
			if (A > 4000) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}

		} else {
			System.out.println("1");
			if (A < 100) {
				System.out.println("2");
			} else {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (A > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Chart();
	}

}