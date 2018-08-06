package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonClient04 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Singleton singleton=Singleton.getInstance();
		ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("Sample.ser"));
		outputStream.writeObject(singleton);
		
		System.out.println("Object save with hashcode:::"+singleton.hashCode());
		outputStream.close();
		
		System.out.println("deserialization-----");
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Sample.ser"));
		Singleton singleton1=(Singleton) ois.readObject();
		ois.close();
		
		System.out.println("data received-->"+ois);
		System.out.println("data received-->"+singleton1.hashCode());
	}

}
