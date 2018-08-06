package com.exilant.mongodb;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetQueryData {

	public static void main(String[] args) {
		MongoClient mongoClient=new MongoClient("localhost",27017);
		
		DB db= mongoClient.getDB("exdb");
		
		DBCollection dbc=db.getCollection("emps");
		
		DBObject queryCondition=new BasicDBObject("empid",103);
		DBObject sortCondition=new BasicDBObject("empname",1);
//		Map<String,Integer> map=new HashMap<>();
//		
//		map.put("empid",1);
//		map.put("empname",1);
//		map.put("_id", 0);
//		
//		DBObject projectionFields=new BasicDBObject(map);
		
		BasicDBObject field=new BasicDBObject();
		//field.put("empid",1);
		//field.put("empname",1);
		field.put("empmail", 0);
		
		
		//DBCursor cursor=dbc.find(queryCondition).sort(sortCondition).limit(2);
		DBCursor cursor=dbc.find(queryCondition,field).sort(sortCondition).limit(2);
		
		while(cursor.hasNext()) {
			DBObject object=cursor.next();
			System.out.println(object);
			
			System.out.println("Employee Id::=>"+object.get("empid"));
			System.out.println("Employee Name::=>"+object.get("empname"));
			System.out.println("Employee Email::=>"+object.get("empmail"));
			
			System.out.println("============");
			
			
		}
	}

}
