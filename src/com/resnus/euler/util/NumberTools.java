package com.resnus.euler.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumberTools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 100; i++){
			if(NumberTools.isEven(i)){
				System.out.println(i + " isEven");
			}
		}
	}

	public static boolean isPrime(double n){
		if (n <= 3) {
			return n > 1;
		}
	
		double rndRoot =  NumberTools.getRoundedSQR(n);
		
		for(int i = 2; i <= rndRoot; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static double getRoundedSQR(double number){
		return Math.ceil(Math.sqrt(number));
	}
	
	public static boolean isEven(double n){
		if (n % 2 == 0)
			return true;
		return false;
	}
	
	public static long binomialCoefficient(int n, int k)
	{
		/* N-choose-k combinatorics: (n! / (k! * (n-k)!)
		 * Where:
		 * 		n is the number of moves,
		 * 		k is the number of down and right moves required (20 each) */
 
		if (k > (n-k))
			k = n - k;
		
		long c = 1;
		
		for (int i = 0; i < k; i++)
		{
			c = c * (n-i);
			c = c / (i+1);			
		}
		
		return c;
	}
	
	public static Set<Integer> getProperDivisors(int n){
		n = Math.abs(n);
		Set<Integer> divisors = new HashSet<Integer>();
		int divisor = 1;
		while (divisor < n){
			if(n % divisor == 0){
				divisors.add(divisor);
			}
			divisor++;
		}
		return divisors;
	}
	
	public static Set<Integer> getProperDivisorsFast(int n){
		Set<Integer> divisors = new HashSet<Integer>();
		n = Math.abs(n);
		int divisor = (int)NumberTools.getRoundedSQR(n);
		while (divisor > 1){
			if(n % divisor == 0){
				divisors.add(n / divisor);
				divisors.add(divisor);
			}
			divisor--;
		}
		divisors.add(1);
		return divisors;
	}
	
	public static int getSum(Collection<Integer> c){
		int sum = 0;
		Iterator<Integer> it = c.iterator();
		
		while(it.hasNext()){
			sum += it.next();
		}
		return sum;
	}
	
	public static int getNumDigits(int i){
		return (int)(Math.log10(i) + 1);
	}
}