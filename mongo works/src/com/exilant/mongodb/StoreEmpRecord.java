package com.exilant.mongodb;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class StoreEmpRecord {

	public static void main(String[] args) {
		MongoClient mongoClient=new MongoClient("localhost",27017);
		
		DB db= mongoClient.getDB("exdb");
		
		DBCollection dbc=db.getCollection("emps");
		// 1st Way
		DBObject object=new BasicDBObject();
		object.put("empid", 301);
		object.put("empname","rakesh");
		object.put("empmail", "raj@gmail.com");
		
		System.out.println("object saved");
		
		//dbc.save(object);
		
		//2nd Way
		Map<String, Object> map=new HashMap<>();
		map.put("empid", 304);
		map.put("empname","rakesh");
		map.put("empmail", "raj@gmail.com");
		//dbc.save(new BasicDBObject(map));
		
		System.out.println("object saved Map");
		
		
		//3rd way
		String jsonString="{empid:303,empname:'raju',"+"empmail:'raju@gmail.com',empsal:34455}";
		
		//dbc.save((DBObject)JSON.parse(jsonString));
		System.out.println("OBJECT SAVED:::");
		
		//4th way
		
		Employee employee=new Employee();
		employee.setEmpId(307);
		employee.setEmpName("Niraj");
		employee.setEmpSal(3987);
		employee.setEmpMail("niraj@gmai.com");
		dbc.save(employee);
		System.out.println("object Saved::::");
		
		

	}

}
