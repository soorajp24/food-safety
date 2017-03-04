package com.infinity.service;

import java.util.List;

import org.bson.Document;

import com.infinity.bo.Check;
import com.infinity.bo.Checklist;
import com.infinity.dataaccess.FoodSafetyDAO;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class ChecklistService {
	
	private final FoodSafetyDAO foodSafetyDAO;
	
	public ChecklistService() {
		final MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost"));
		final MongoDatabase foodSafetyDatabase = mongoClient.getDatabase("foodsafety");
		foodSafetyDAO = new FoodSafetyDAO(foodSafetyDatabase);
	}
	
	// returns a list of all checks
	public List<Document> getAllChecklists() { 
		
		List <Document> checks = foodSafetyDAO.findChecklists();
		
		return checks;
	}
	
	public String saveChecklist(Checklist checklist) {
		return foodSafetyDAO.saveChecklist(checklist);
	}

}
