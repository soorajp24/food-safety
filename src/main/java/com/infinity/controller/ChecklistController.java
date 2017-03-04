package com.infinity.controller;

import static spark.Spark.after;
import static spark.Spark.get;
import static spark.Spark.post;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infinity.bo.Checklist;
import com.infinity.service.ChecklistService;
import com.infinity.util.JsonUtil;

public class ChecklistController {
	
	public ChecklistController(final ChecklistService checklistService) {
		
		// https://dzone.com/articles/building-simple-restful-api
		get("/checklists", (req, res) -> checklistService.getAllChecklists(), JsonUtil.json());
		
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
		
		// https://sparktutorials.github.io/2015/04/03/spark-lombok-jackson-reduce-boilerplate.html
		/*{"name":"Sample Checklist - 1","completedBy":"Sooraj","executionTime":"","frequency":"daily","department":"Produce",
			"autoSpawn":"Yes","action":"Not Available", "createAlerts":"Yes"} */
		
		post("/checklists", (request, response) -> {
		    try {
		        ObjectMapper mapper = new ObjectMapper();
		        Checklist checklistRequest = mapper.readValue(request.body(), Checklist.class);
		        String id = checklistService.saveChecklist(checklistRequest);
		        response.status(200);
		        response.type("application/json");
		        return id;
		    } catch (JsonParseException jpe) {
		        response.status(400);
		        return "";
		    }
		});
		
	}

}
