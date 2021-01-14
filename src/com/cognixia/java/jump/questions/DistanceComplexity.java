package com.cognixia.java.jump.questions;

public class DistanceComplexity {
	
	//Returns count of ways to cover a given distance
	static int coverageCount(int distance) {
		//Base cases covering 0 and a distance less than 0
		if (distance < 0)
			return 0;
		if (distance == 0)
			return 1;
		
		//Recursion for all previous 3 and adding results
		return coverageCount(distance - 1) + coverageCount(distance - 2) + coverageCount(distance - 3);
	}

	public static void main(String[] args) {
		
		int distance = 5;
		System.out.println(coverageCount(distance));

	}

}
