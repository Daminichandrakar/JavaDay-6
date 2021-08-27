package com.bl.javaprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scan.nextInt();
		int count = 0;
		PrimeNumber.prime(number, count);
	}

	public static void prime(int number, int count) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count += 1;
			}
		}
		if (count == 2) {
			System.out.println("prime number");
		} else {

			System.out.println("not prime");
		}
	}
}
