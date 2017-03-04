package com.infinity.dataaccess;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.infinity.bo.Check;
import com.infinity.bo.Checklist;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class FoodSafetyDAO {
	
	private final MongoCollection<Document> checksCollection;
	
	private final MongoCollection<Document> checklistsCollection;
	
    public FoodSafetyDAO(final MongoDatabase foodSafetyDatabase) {
    	checksCollection = foodSafetyDatabase.getCollection("checks");
    	checklistsCollection = foodSafetyDatabase.getCollection("checklists");
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
    
    public List<Document> findChecklists() {
        return checklistsCollection.find().into(new ArrayList<Document>());
    }
    
    public String saveChecklist(Checklist checklist) {
    	
    	Document checklistToInsert = new Document("name", checklist.getName())
                .append("completedBy", checklist.getCompletedBy())
                .append("executionTime", checklist.getExecutionTime())
                .append("frequency", checklist.getFrequency())
                .append("department", checklist.getDepartment())
                .append("autoSpawn", checklist.getAutoSpawn())
                .append("action", checklist.getAction())
                .append("createAlerts", checklist.getCreateAlerts());

    	checklistsCollection.insertOne(checklistToInsert);

    	return "";
        
    }

}
