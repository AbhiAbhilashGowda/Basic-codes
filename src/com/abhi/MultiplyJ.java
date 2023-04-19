10package com.abhi;

import java.util.Scanner;

public class MultiplyJ {
	public static void main(String[] args) {
		MultiplyJ multiplyJava = new MultiplyJ();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first no : ");
		int in1 = scanner.nextInt();
		System.out.println("Enter the second no : ");
		int in2 = scanner.nextInt();
		int out = multiplyJava.first(in1, in2);
		System.out.println("The answer is = " + out);

	}

	public int first(int value1, int value2) {
		int output = value1 * value2;
		return output;

	}
}
