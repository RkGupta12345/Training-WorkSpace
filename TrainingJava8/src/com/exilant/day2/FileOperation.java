package com.exilant.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		//writeToFile();
		//writeToFile1();
		readToFile1();
		
	}
	
	public static void writeToFile()   {
		BufferedWriter bw=null;
		//earlier to 1.8
		try {
			 bw=new BufferedWriter(new FileWriter("Sample1.txt"));
			bw.write("Hello");
			bw.newLine();
			bw.write("How are u today");
			bw.newLine();
			bw.write("Its nice weather");
			bw.newLine();
			
			System.out.println("Data saved successfully::::");
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch ( IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void writeToFile1() throws IOException {
		try (BufferedWriter bw1=new BufferedWriter(new FileWriter("Sample.txt"))){
			bw1.write("Hello");
			bw1.newLine();
			bw1.write("How are u today");
			bw1.newLine();
			bw1.write("Its nice weather");
			bw1.newLine();
		}
		
		System.out.println("Data saved successfully::::");
	}
	
	public static void readToFile1() throws IOException {
		try (
		BufferedReader bw1=new BufferedReader(new FileReader("Sample.txt"))
		){
			bw1.lines().forEach(System.out::println);
			}
		     System.out.println("Data read successfully::::");
		}
		
		
	}


