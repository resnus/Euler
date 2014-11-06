package com.resnus.euler.problem18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.resnus.euler.util.FileUtils;

public class TriangleBuilder {
	static String LOCATION = "C:\\JAVA\\Euler\\13\\triangle_18.txt";
	private final Map<Integer, List<Integer>> pyramid = new HashMap<Integer, List<Integer>>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleBuilder tb = new TriangleBuilder();
		ArrayList<String> lines = FileUtils.readFileIntoList(LOCATION);
		
		tb.generateNodeList(lines);
		tb.printMap();
	}
	public void generateNodeList(ArrayList<String> lines){
		for(int i = 0; i < lines.size(); i++){ // Iterate over lines
			String line = lines.get(i);
			String[] values = line.split(" ");
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			for(String num : values){
				numbers.add(Integer.valueOf(num));
				System.out.print(Integer.valueOf(num) + " ");
			}
			pyramid.put(i, numbers);
			System.out.println();
		}
	}
	
	public void printMap(){
		System.out.println(pyramid);
	}
}
