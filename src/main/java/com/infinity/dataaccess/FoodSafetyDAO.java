package com.infinity.dataaccess;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.infinity.bo.Check;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class FoodSafetyDAO {
	
	private final MongoCollection<Document> checksCollection;
	
    public FoodSafetyDAO(final MongoDatabase foodSafetyDatabase) {
    	checksCollection = foodSafetyDatabase.getCollection("checks");
    }
    
    
    public List<Document> findChecks() {
        return checksCollection.find().into(new ArrayList<Document>());
    }
    
    public String saveCheck(Check check) {
    	
    	Document checkToInsert = new Document("name", check.getName())
                .append("department", check.getDepartment())
                .append("language", check.getLanguage())
                .append("criticalLimit", check.getCriticalLimit())
                .append("correctiveAction", check.getCorrectiveAction());

    	checksCollection.insertOne(checkToInsert);

    	return "";
        
    }

}
