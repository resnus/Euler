package com.resnus.euler.problem15;

import com.resnus.euler.util.NumberTools;

public class LatticePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 20;
		System.out.println("PATHS: " + NumberTools.binomialCoefficient(2 * SIZE, SIZE));
	}

}
