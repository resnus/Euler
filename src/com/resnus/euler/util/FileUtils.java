package com.resnus.euler.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

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
	
	public static <E> Collection<E> readFileIntoCollection(Collection<E> col, String location, char separator){
		File f = new File(location);
		FileReader fr = null;
		char[] buffer = new char[1024];
		int count = 0;
		StringBuilder sb = new StringBuilder();
		
		if(f.exists()){
			try {
				fr = new FileReader(f);
				while((count = fr.read(buffer)) != -1){
					for(int i = 0; i < count; i++){
						if(buffer[i] != separator){
							sb.append(buffer[i]);
						}else{
							col.add((E)sb.toString());
							sb = new StringBuilder();
							//sb.delete(0, sb.length());
						}
						//System.out.println("c: " + buffer[i]);
						buffer[i] = 0;
					}
				}
				col.add((E)sb.toString());
				sb = new StringBuilder();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				if(fr != null){
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		return col;
	}

}
