package com.infinity.service;

import java.util.List;

import org.bson.Document;

import com.infinity.dataaccess.FoodSafetyDAO;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class CheckService {
	
	private final FoodSafetyDAO foodSafetyDAO;
	
	public CheckService() {
		final MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost"));
		final MongoDatabase foodSafetyDatabase = mongoClient.getDatabase("foodsafety");
		foodSafetyDAO = new FoodSafetyDAO(foodSafetyDatabase);
	}
	
	// returns a list of all checks
	public List<Document> getAllChecks() { 
		
		List <Document> checks = foodSafetyDAO.findChecks();
		
		return checks;
	}

}
