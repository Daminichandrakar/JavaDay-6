package com.bl.javaprogram;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		System.out.println("Press any key to start stopwatch");
		Scanner scan = new Scanner(System.in);
		char x = scan.next().charAt(0);
		double start = StopWatch.start();

		System.out.println("Press any key to stop stopwatch");
		char y = scan.next().charAt(0);
		double stop = StopWatch.stop();
		System.out.println("Time: " + (stop - start) + " ms");
	}

	public static double start() {
		double start = System.currentTimeMillis();
		System.out.println("start :-" + start);
		return start;
	}

	public static double stop() {
		double stop = System.currentTimeMillis();
		System.out.println("End :- " + stop);
		return stop;
	}

}
