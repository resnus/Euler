package com.resnus.euler.problem16;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PowerDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bi = new BigInteger("2");
		bi = bi.pow(1000);
		
		String digits = bi.toString();
		
		System.out.println("Digits: " + digits);
		
		int sum = 0;
		
		for(int i = 0;i < digits.length(); i++){
			Integer x = Character.getNumericValue(digits.charAt(i));
			//System.out.println("int: " + x);
			sum += x;
		}
		
		System.out.println("SUM: " + sum);
	}
}
