package com.exilant.mongodb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

public class StoreImage {

	public static void main(String[] args) throws FileNotFoundException {
		MongoClient mongoClient=new MongoClient("localhost",27017);
		
		DB db= mongoClient.getDB("exdb");
		
		GridFS gfs= new GridFS(db,"myimage");
		String path="/Users/ravi.kumar/Desktop/image";
		File folderPath=new File(path);
		
		for(File file:folderPath.listFiles()) {
			InputStream inputStream=new FileInputStream(file);
			GridFSInputFile picture=gfs.createFile(inputStream,file.getName());
			
			picture.setMetaData(new BasicDBObject("description","Image"+file.getName()+"store in exilant"));
			
			picture.save();
			
		}
		mongoClient.close();
		
		System.out.println("Picture Saved in DB::::");

	}

}
