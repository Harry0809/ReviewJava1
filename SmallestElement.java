package com.Review1.java;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}

		System.out.println("smallest elemnent in the array is:" + min);
	}

}
