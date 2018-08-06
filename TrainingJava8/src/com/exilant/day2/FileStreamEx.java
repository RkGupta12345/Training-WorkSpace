package com.exilant.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreamEx {

	public static void main(String[] args) throws IOException {
		
		Files.list(Paths.get("."))
		.map(Path:: getFileName)
		.forEach(System.out::println);
		
		System.out.println("----------------");
		Stream.of("One","Two","Three")
		.map(String:: toUpperCase)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("-------------------");
		Files.list(Paths.get("."))
		.map(Path:: getFileName)
		.map(Path::toString)
		.map(String::toUpperCase)
		.filter(name->name.endsWith("TXT"))
		.sorted()
		.skip(1)
		.limit(5)
		//.forEach(name->doSomeAction(name));
		//.forEach(System.out::println);
		.forEach(name->{
			try {
				readToFile1(name);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		
	}
	
	// To do given the filename, show the content of the same
	//and only show those lines which has Exilant (either in upper or lower case)
	public static void doSomeAction(String fileName) {
		System.out.println("Your action goes here::"+fileName);
	}
	
	public static void readToFile1(String filename) throws IOException {
		System.out.println(filename);
	
		try (
		BufferedReader bw1=new BufferedReader(new FileReader(filename))
		){
			bw1.lines().filter(namematch->namematch.contains("exilant")).forEach(System.out::println);
			 
			
		}


			
	}

}
