package com.exilant.mongodb;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class GetMetaData {

	public static void main(String[] args) {
		MongoClient mongoClient=new MongoClient("localhost",27017);
		System.out.println("Connection got"+mongoClient);
		
		System.out.println("List of DBS from Mongos:");
		
		for(String dbName:mongoClient.getDatabaseNames()) {
			System.out.println("\t"+dbName);
			
			System.out.println("========");
		DB dbNam=mongoClient.getDB(dbName);
		
		for(String collName:dbNam.getCollectionNames()) {
			System.out.println("\t"+collName);
		}

	}
	}
}



