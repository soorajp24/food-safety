package com.infinity.dataaccess;

import java.util.HashSet;
import java.util.Set;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import com.infinity.bo.Check;
import com.infinity.bo.Checklist;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class FoodSafetyDAO {
	
	MongoCollection jongoChecklistsCollection = null;
	
	MongoCollection jongoChecksCollection = null;
	
    public FoodSafetyDAO() {
    	
    	final Jongo jongo = new Jongo(new MongoClient(new MongoClientURI("mongodb://localhost")).getDB("foodsafety"));
    	jongoChecklistsCollection = jongo.getCollection("checklists");
    	jongoChecksCollection = jongo.getCollection("checks");
    }
    
    
    public Set<Check> findChecks() {

    	MongoCursor<Check> checksCursor = jongoChecksCollection.find().as(Check.class);
        Set<Check> checks = new HashSet<Check>();
        for(Check check : checksCursor) {
        	checks.add( check );
        }
        return checks;
        
    }
    
    public String saveCheck(Check check) {
    	
    	jongoChecksCollection.save(check);

    	return "";
        
    }
    
    public Set<Checklist> findChecklists() {
    			
    	MongoCursor<Checklist> checklistsCursor = jongoChecklistsCollection.find().as(Checklist.class);
        Set<Checklist> checklists = new HashSet<Checklist>();
        for(Checklist checklist : checklistsCursor) {
        	checklists.add( checklist );
        }
        return checklists;
   
    }
    
    public String saveChecklist(Checklist checklist) {
    	
    	jongoChecklistsCollection.save(checklist);

    	return "";
        
    }

}
