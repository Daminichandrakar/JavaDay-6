package com.bl.javaprogram;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		n = scan.nextInt();

		String s = String.format("%8s", Integer.toBinaryString(n)).replaceAll(" ", "0");
		System.out.println(s);
		System.out.println("After conversion");
		int length = s.length();
		String first = s.substring(0, s.length() / 2);
		String secound = s.substring(s.length() / 2);
		String sum = (secound + first);
		System.out.println(sum);
		int decimal = Integer.parseInt(sum, 2);//binary to  decimal conversion
		System.out.println(decimal);
	}

}
