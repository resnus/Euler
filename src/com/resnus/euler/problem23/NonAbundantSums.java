package com.resnus.euler.problem23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.resnus.euler.util.NumberTools;

public class NonAbundantSums {
	public static final int CEILING = 28123;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// TODO Auto-generated method stub
		//Set<Integer> abunNums = new HashSet<Integer>();
		List<Integer> abunNums = new ArrayList<Integer>();
		Set<Integer> abunSums = new HashSet<Integer>();
		
		int sum;
		for(int i = 12; i < 28123; i++){
			sum = NumberTools.getSum(NumberTools.getProperDivisorsFast(i));
			if(sum > i){
				//System.out.println("Defficient/Perfect: " + i + "->" + sum);
				abunNums.add(i); // Populate abundant numbers
			}
		}
		
		for(int x : abunNums){
			for(int y : abunNums){
				abunSums.add(x + y);
			}
		}
		
		int result = 0;
		for (int i = 1; i < CEILING + 1; i++){
			if(!abunSums.contains(i)){
				result += i;
			}
		}
		System.out.println("SUM: " + result + " finished in " + (System.currentTimeMillis() -start));
		
		NonAbundantSums.method1();
	}

	public static void method1() {
		long start = System.currentTimeMillis();
		// TODO Auto-generated method stub
		//Set<Integer> abunNums = new HashSet<Integer>();
		List<Integer> abunNums = new ArrayList<Integer>();

		int sum;
		for(int i = 12; i < 28123; i++){
			sum = NumberTools.getSum(NumberTools.getProperDivisorsFast(i));
			if(sum > i){
				//System.out.println("Defficient/Perfect: " + i + "->" + sum);
				abunNums.add(i); // Populate abundant numbers
			}
		}
		
		int numSum = 0, result;
		for (int i = 1; i < CEILING + 1; i++){
			for(int x : abunNums){ // Iterate over the abundant numbers
				result = i - x;
				if(result < 0){
					//System.out.println(i + " - " + x  + " = " + result);
					numSum += i;
					break;
				}else if(abunNums.contains(result)){
					//System.out.println(i + " TWO ABUN " + x + " - " + result);
					break;
				}
			}
		}
		System.out.println("SUM: " + numSum + " finished in " + (System.currentTimeMillis() -start));
	}
	
}