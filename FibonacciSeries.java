package com.bl.javaprogram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.print(a + " " + b);
		FibonacciSeries.fibonacci(a, b, number);
	}

	public static int fibonacci(int a, int b, int number) {
		int i = 0;
		while (i < number) {
			int c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			i++;
		}
		return 0;
	}

}
