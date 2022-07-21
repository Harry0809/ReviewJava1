package com.Review1.java;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		int z;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("Before swapping the numbers" + " " + x + " " + y);
		// swapping
		z = x;
		x = y;
		y = z;

		System.out.println("After Swapping:" + x + " " + y);

	}

}
