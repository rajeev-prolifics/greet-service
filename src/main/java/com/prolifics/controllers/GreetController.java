package com.prolifics.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prolifics.util.GreetHelper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * GreetController is the core REST Controller which contains
 * operations of the greet-service Microservice.
 * 
 * @author Prolifics
 *
 */
@CrossOrigin(origins = "*")
@RestController
@Tag(name = "Greet", description = "Greets a user.")
public class GreetController {
	/**
	 * The Logger instance.
	 */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());	

	
	/**
	 * greet is a basic REST API method which accepts a name as an input
	 * and returns a JSON with a greeting message and a random quote.
	 * 
	 * @param username
	 * 	<p>The username passed as an input.</p>
	 * @return
	 * 	<p>The desired API output as JSON.</p>
	 */
	@Operation(summary = "Greets a user", description = "Greets a user", tags = { "Greet" })
	@RequestMapping(value = "/greet/{username}", method=RequestMethod.GET)
	public @ResponseBody Map<String,String> greet(@PathVariable String username){
		logger.info("Entering GreetController.greet() method.");
		Map<String,String> response = new HashMap<String,String>();
		response.put("message", "Hi "+username+", Welcome to Greet API.");
		response.put("quote", GreetHelper.getRandomQuote());
		logger.info("Exiting GreetController.greet() method.");
		return response;
    }
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody String ping(){
		return "Server is up!";
    }
	
}
