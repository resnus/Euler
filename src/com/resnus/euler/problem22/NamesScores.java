package com.resnus.euler.problem22;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.resnus.euler.util.FileUtils;

public class NamesScores {
	public static final String LOCATION = "C:\\JAVA\\Euler\\22\\p022_names.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		long totalScore = 0;
		
		Set<String> names = new TreeSet<String>();
		String name;
		FileUtils.readFileIntoCollection(names, LOCATION, ',');
		
		Iterator<String> it = names.iterator();
		int count = 1;
		while(it.hasNext()){
			name = it.next();
			totalScore += (getSumOfChars(name) * count);
			count++;
		}
		System.out.println("Total Score: " + totalScore);
		System.out.println("Ran in: " + (System.currentTimeMillis() - start));
	}

	public static int getSumOfChars(String name){
		int sum = 0;
		for(char c : name.toLowerCase().toCharArray()){
			sum += ((int)c - 96);
		}
		return sum;
	}
}
