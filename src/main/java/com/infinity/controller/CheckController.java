package com.infinity.controller;

import static spark.Spark.*;

import com.infinity.service.CheckService;
import com.infinity.util.JsonUtil;

public class CheckController {
	
	public CheckController(final CheckService checkService) {
		
		get("/checks", (req, res) -> checkService.getAllChecks(), JsonUtil.json());
		
		// Routes defined using lambda expressions. Above code is the equivalent of:
		
		/* get("/users", 
				new Route() {
					public Object handle(Request request, Response response) {
						// process request
						return checkService.getAllChecks();
					}
				}
		); */
		
		after((req, res) -> {
			res.type("application/json");
			});
		
	}

}
