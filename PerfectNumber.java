package com.bl.javaprogram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scan.nextInt();
		PerfectNumber.perfectnumber(number);
	}

	public static void perfectnumber(int num) {
		for (int i = 1; i < num; i++) {
			while (num % i == 0) {
				i += i;
				if (i == num) {
					System.out.println(" perfectnumber");
				}
				break;
			}
		}
	}

}
