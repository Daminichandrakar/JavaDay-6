package com.bl.javaprogram;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal loan amount");
		int P = scan.nextInt();
		System.out.println("Enter year");
		int Y = scan.nextInt();
		System.out.println("Enter interest amount");
		int R = scan.nextInt();
		int n = 12 * Y;
		int r = R / (12 * 100);

		int payment = (int) ((P * r) / (1 - Math.pow((1 + r), n)));
		System.out.println(payment);
	}

}
