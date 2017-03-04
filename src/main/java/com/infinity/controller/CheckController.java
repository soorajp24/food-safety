package com.infinity.controller;

import static spark.Spark.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infinity.bo.Check;
import com.infinity.service.CheckService;
import com.infinity.util.JsonUtil;

public class CheckController {
	
	public CheckController(final CheckService checkService) {
		
		// https://dzone.com/articles/building-simple-restful-api
		get("/checks", (req, res) -> checkService.getAllChecks(), JsonUtil.json());
		
		after((req, res) -> {
			res.type("application/json");
			});
		
		// https://sparktutorials.github.io/2015/04/03/spark-lombok-jackson-reduce-boilerplate.html
		/*
		 * {"name":"Dairy Freshness Check","department":"Dairy","language":"US-English", "subChecks":["Yogurt", "Cookie"],
		 * "criticalLimit":"Appear stale","correctiveAction":"Remove"}
		 */
		post("/checks", (request, response) -> {
		    try {
		        ObjectMapper mapper = new ObjectMapper();
		        Check checkRequest = mapper.readValue(request.body(), Check.class);
		        String id = checkService.saveCheck(checkRequest);
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
