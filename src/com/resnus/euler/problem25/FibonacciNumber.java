package com.resnus.euler.problem25;

import java.math.BigInteger;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 2;
		BigInteger x = new BigInteger("1");
		BigInteger y = new BigInteger("1");
		BigInteger z = new BigInteger("0");
		
		while(y.toString().length() < 1000){
			z = x.add(y);
			x = y;
			y = z;
			count++;
		}
		System.out.println(count + " " + y);
	}

	public static void fibonacci(int x, int y){
		System.out.println(x + " " + y);
		fibonacci(y, x + y);
	}
}
