package com.bl.javaprogram;

import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		n = scan.nextInt();
		//Binary conversion
		String s = String.format("%4s", Integer.toBinaryString(n)).replaceAll(" ", "0");
		System.out.println(s);
	}
}
