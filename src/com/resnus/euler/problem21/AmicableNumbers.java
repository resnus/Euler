package com.resnus.euler.problem21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.resnus.euler.util.NumberTools;

public class AmicableNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(3 / 2);
		long start = System.currentTimeMillis();
		
		Set<Integer> amicNumbers = new HashSet<Integer>();
		
		for(int i = 2 ; i < 10000; i++){
			int sum = AmicableNumbers.sumOfDivisors(i);
			int sum2 = AmicableNumbers.sumOfDivisors(sum);
			
			if(i == sum2 && sum != sum2){
				//System.out.println("Number: " + i + " Sum: " + sum + " sum of sum of divisors: " + sum2);
				amicNumbers.add(i);
				amicNumbers.add(sum);
			}
		}
		System.out.println("Sum: " + NumberTools.getSum(amicNumbers));
		System.out.println("Ran in: " + (System.currentTimeMillis()-start));
	}

	private static int sumOfDivisors(int n){
		Set<Integer> divisors = NumberTools.getProperDivisorsFast(n);
		
		return NumberTools.getSum(divisors);
	}
}
