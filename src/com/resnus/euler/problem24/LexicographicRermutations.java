package com.resnus.euler.problem24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.omg.CORBA.CharSeqHolder;

public class LexicographicRermutations {
	static Set<String> permutations = new TreeSet<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] digits =  {'0','1','2','3','4','5','6','7','8','9'};
	
		LexicographicRermutations.permute(digits, digits.length);
		System.out.println("SIZE: " + permutations.size());
		
		int count = 1;
		
		for(String s : permutations){
			if(count == 1000000){
				System.out.println("Value: " + s);
			}
			count++;
		}
	}
	
	private static void swap(char[] v, int i, int j) {
		char t = v[i]; v[i] = v[j]; v[j] = t;
	}
 
	public static void permute(char[] v, int n) {
		if (n == 1) {
			//System.out.println(Arrays.toString(v));
			permutations.add(String.valueOf(v));
		} else {
			for (int i = 0; i < n; i++) {
				permute(v, n-1);
				if (n % 2 == 1) {
					swap(v, 0, n-1);
				} else {
					swap(v, i, n-1);
				}
			}
		}
	}
 
}
