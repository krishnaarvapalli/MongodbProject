package mongodbproj;

import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class InsertDriver {

	public static void main(String[] args) {
		
		DB dB = (new MongoClient("localhost" , 27017)).getDB("krishna");
		
		DBCollection dBCollection = dB.getCollection("Channel");
		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.put("name", "rk");
		basicDBObject.put("age", 30);
		basicDBObject.put("createdDate", new Date());
		table.insert(basicDBObject);
		
		

	}

}
