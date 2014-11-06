package com.resnus.euler.problem14;

import java.util.ArrayList;

import com.resnus.euler.util.NumberTools;

public class CollatzSequence {

	public static void main(String[] args) {
		ArrayList<Long> sequence = new ArrayList<Long>();
		ArrayList<Long> tempSequence;
		// TODO Auto-generated method stub
		for(long i = 13; i < 1000000; i++){
			tempSequence = generateSequence(i);
			if(tempSequence.size() > sequence.size()){
				sequence = tempSequence;
			}
		}
		printSequence(sequence);
	}
	
	private static ArrayList<Long> generateSequence(long i){
		ArrayList<Long> sequence = new ArrayList<Long>();
		sequence.add(i);

		while(i > 1){
			if(NumberTools.isEven(i)){
				i = processEven(i);
			}else{
				i = processOdd(i);
			}
			sequence.add(i);
		}
		return sequence;
	}

	private static long processEven(long n){
		return n / 2;
	}
	
	private static long processOdd(long n){
		return  (n * 3) + 1;
	}
	
	private static void printSequence( ArrayList<Long> sequence){
		System.out.println("Longest sequence: " + sequence.size());
		for(long i : sequence){
			System.out.print(i + "->");
		}
		System.out.println();
	}
}
