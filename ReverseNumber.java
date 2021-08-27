package com.bl.javaprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scan.nextInt();
		ReverseNumber.reverse(number);

	}

	public static void reverse(int number) {
		for (int i = 0; number > 0; i++) {
			int rev = number % 10;
			number = number / 10;
			System.out.print(rev);
		}
	}

}
