package com.resnus.euler.problem13;

import java.math.BigInteger;

import com.resnus.euler.util.FileUtils;

public class LargeSumBigInteger {
	public static String location = "C:\\JAVA\\Euler\\13\\input_numbers.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum = new BigInteger("0");
		
		for(String num : FileUtils.readFileIntoList(location)){
			sum = sum.add(new BigInteger(num));
		}
		
		System.out.print("SUM: " + sum);
	}

}
