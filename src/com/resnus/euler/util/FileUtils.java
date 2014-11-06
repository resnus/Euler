package com.resnus.euler.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lines = FileUtils.readFileIntoList("C:\\JAVA\\Euler\\13\\input_numbers.txt");
		for(String s : lines){
			System.out.println("LINE: " + s);
		}
	}
	
	public static ArrayList<String> readFileIntoList(String location){
		BufferedReader br = null;
		String line = null;
		ArrayList<String> contents = null;
		
		File f = new File(location);
		
		if(f.exists()){
			contents = new ArrayList<String>();
			
			try {
				br = new BufferedReader(new FileReader(f));
				while((line = br.readLine()) != null){
					contents.add(line);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					if(br != null) br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return contents;
	}
}
