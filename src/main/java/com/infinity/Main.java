package com.infinity;

import com.infinity.controller.CheckController;
import com.infinity.controller.ChecklistController;
import com.infinity.service.CheckService;
import com.infinity.service.ChecklistService;

public class Main {
	
	public static void main(String[] args) {
		new CheckController(new CheckService());
		new ChecklistController(new ChecklistService());
	}

}
