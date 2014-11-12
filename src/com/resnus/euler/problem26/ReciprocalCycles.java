package com.resnus.euler.problem26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.resnus.euler.util.NumberTools;

public class ReciprocalCycles {

	public static void main(String[] args) {

		for(int i = 1; i < 10; i++){
			process(i);
		}
//		for (int i = 1; i < 1000; i++){
//			String remainder = getDecimal(i);
//			String temp = getPattern(remainder);
//			if(temp.length() > pattern.length()){
//				d = i;
//				pattern = temp;
//			}
//		}
//		System.out.println(d + " Longest Pattern: " + pattern);
	}
	
	public static String getDecimal(int i){
		//int numDigits = NumberTools.getNumDigits(i);
		//System.out.println("NUMBER: " + i);
		StringBuilder decimal = new StringBuilder();
		int num = 1, result = 0, remainder = -1;
		while(remainder != 0 && decimal.length() < 99999){
			while(num < i){
				num *= 10;
			}
			result = num / i;
			remainder = num % i;
			
			//System.out.println(i + " " + result + " " + remainder);
			
			decimal.append(result);
			num = remainder;
		}
		//System.out.println(decimal);
		
		return decimal.toString();
	}
	
	public static String getPattern(String s){
		//System.out.println("Decimal: " + s);
		StringBuilder pattern = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++){
			pattern.append(s.charAt(i));
			//String temp = pattern.toString() + s.charAt(i);
			//System.out.println("P: " + pattern);
			if(s.lastIndexOf(pattern.toString()) > i){ // PATTERN EXISTS
				if(//pattern.length() > 1 &&
				   pattern.toString().equals(s.substring(i+1, i + 1 + pattern.length()))){
					return pattern.toString();
				}
			}else{
				pattern = pattern.delete(0, pattern.length());
			}
		}
		return pattern.toString();
	}
	
	public static void process(int i){
		int[] remainders = new int[i];
		int remainder = -1;
		int num = 1;
		int position = 0;
		System.out.println(i);
		while(remainder != 0 && position < i){
			if(num != i) num *= 10;
			remainders[position++] = num / i;
			num %= i;
		}
		printArr(remainders);
	}
	
	public static void printArr(int[] arr){
		System.out.print("[");
		for(int i : arr){
			System.out.print(i + ",");
		}
		System.out.println("]");
	}
}
