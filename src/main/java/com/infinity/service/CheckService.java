package com.infinity.service;

import java.util.ArrayList;
import java.util.List;

import com.infinity.bo.Check;

public class CheckService {
	
	// returns a list of all checks
	public List<Check> getAllChecks() { 

		// dummy code to test the service. Fetch from Mongo DB
		List <Check> checks = new ArrayList<Check>();
		Check check = new Check();
		check.setCheckId(1);
		checks.add(check);
		
		return checks;
	}

}
