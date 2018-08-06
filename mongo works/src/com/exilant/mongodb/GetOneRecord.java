package com.exilant.mongodb;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetOneRecord {

	public static void main(String[] args) {
		MongoClient mongoClient=new MongoClient("localhost",27017);
		
		DB db= mongoClient.getDB("exdb");
		
		DBCollection dbc=db.getCollection("emps");
		
		DBObject myObject=dbc.findOne();
		
		System.out.println("Employee Id::=>"+myObject.get("empid"));
		System.out.println("Employee Name::=>"+myObject.get("empname"));
		System.out.println("Employee Email::=>"+myObject.get("empmail"));
		

	}

}
