package com.infinity.dataaccess;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

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

}
