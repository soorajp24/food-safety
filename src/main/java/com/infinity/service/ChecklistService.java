package com.infinity.service;

import java.util.Set;

import com.infinity.bo.Checklist;
import com.infinity.dataaccess.FoodSafetyDAO;

public class ChecklistService {
	
	private final FoodSafetyDAO foodSafetyDAO;
	
	public ChecklistService() {;
		foodSafetyDAO = new FoodSafetyDAO();
	}
	
	// returns a list of all checks
	public Set<Checklist> getAllChecklists() { 
		
		Set<Checklist> checks = foodSafetyDAO.findChecklists();
		
		return checks;
	}
	
	public String saveChecklist(Checklist checklist) {
		return foodSafetyDAO.saveChecklist(checklist);
	}

}
