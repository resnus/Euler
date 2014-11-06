package com.resnus.euler.problem13;

import java.util.ArrayList;
import java.util.List;

import com.resnus.euler.util.FileUtils;

public class LargeSum {
	public static String location = "C:\\JAVA\\Euler\\13\\input_numbers.txt";
	private List<String> numbers;
	private double sum = 0;
	
	public static void main(String[] args) {
		LargeSum ls = new LargeSum();
		System.out.println("SUM: " + ls.getSum());
		//System.out.println((7 + 1) % 10);
	}
	
	private String getSum(){
		numbers = FileUtils.readFileIntoList(location);
		String sum = "0";
		for(String n : numbers){
			System.out.println("Number : " + n);
			sum = addStrings(sum, n);
			System.out.println("Sum : " + sum);
		}
		return sum;
	}

	public String addStrings(String x, String y){
		System.out.println("Adding: " + x + " to " + y);
		StringBuilder result = new StringBuilder();
		String a = new StringBuilder(x).reverse().toString();
		String b = new StringBuilder(y).reverse().toString();
		int sum = 0, carry = 0;
		
		int max = (x.length() >= y.length()) ? x.length() : y.length();

		for(int i = 0; i < max; i++){
			sum = Character.getNumericValue(getCharacter(a, i)) +
				  Character.getNumericValue(getCharacter(b, i)) +
				  carry;
			carry = sum / 10;
			sum = sum % 10;
			result.append(sum);
			if(i == max - 1 && carry != 0){
				result.append(carry);
			}
		}
		return result.reverse().toString();
	}
	
	private char getCharacter(String s, int index){
		if(index < s.length())
			return s.charAt(index);
		else
			return '0';
	}
}
