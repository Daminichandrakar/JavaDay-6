package com.bl.javaprogram;

import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1. c to f conversion  \n2. f to c conversion");
		int num = scan.nextInt();
		System.out.println("Enter number");
		int num1 = scan.nextInt();
		Temprature.choice(num, num1);
	}

	public static void celsiusytofahrenheit(double num) {
		double fahrenheit = (num * 9 / 5) + 32;
		System.out.println("f " + fahrenheit);
	}

	public static void celsiusytofahrenheit1(double num) {
		double fahrenheit1 = (num - 32) * 5 / 9;
		System.out.println("c " + fahrenheit1);
	}

	public static void choice(int num, int num1) {
		switch (num) {
		case 1:
			Temprature.celsiusytofahrenheit(num1);
			break;
		default:
			Temprature.celsiusytofahrenheit1(num1);
			break;
		}
	}

}
