package com.resnus.euler.problem20;

import java.math.BigDecimal;

public class FactorialProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bd = new BigDecimal("1");
		int sum = 0;
		for(int i = 2; i <= 100; i++){
			//if(i % 10 != 0){
				System.out.println(i);
				bd = bd.multiply(new BigDecimal(i));
			//}
		}
		System.out.println("Results: " + bd);
		
		for(char c : bd.toString().toCharArray()){
			System.out.print(c + "+");
			sum += Character.getNumericValue(c);
		}
		System.out.println();
		System.out.println("Sum: " + sum);
	}

}