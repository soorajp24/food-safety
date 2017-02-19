package com.infinity;

import com.infinity.controller.CheckController;
import com.infinity.service.CheckService;

public class Main {
	
	public static void main(String[] args) {
		new CheckController(new CheckService());
	}

}
