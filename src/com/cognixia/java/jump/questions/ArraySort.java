package com.cognixia.java.jump.questions;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] array = {19, 23, 47, 99, 8, 111, 7};
		System.out.println("Original array: " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted array: " + Arrays.toString(array));

	}

}
