package com.infinity.service;

import java.util.Set;

import com.infinity.bo.Check;
import com.infinity.dataaccess.FoodSafetyDAO;

public class CheckService {
	
	private final FoodSafetyDAO foodSafetyDAO;
	
	public CheckService() {
		foodSafetyDAO = new FoodSafetyDAO();
	}
	
	// returns a list of all checks
	public Set<Check> getAllChecks() { 
		
		Set <Check> checks = foodSafetyDAO.findChecks();
		
		return checks;
	}
	
	public String saveCheck(Check check) {
		return foodSafetyDAO.saveCheck(check);
	}

}
