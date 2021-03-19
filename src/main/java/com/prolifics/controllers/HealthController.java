package com.prolifics.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * HealthController exposes API operations to validate the Health 
 * of the Microservice. These methods will be triggered by the Container
 * Orchestration Platform to check the liveliness and readiness of the Service.
 * 
 * @author Prolifics
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/health")
@Tag(name = "HealthCheck", description = "Heath Check API")
public class HealthController {
	/**
	 * The Logger instance.
	 */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());	

	/**
	 * ping method is used to validate the connectivity
	 * of the API.
	 */
	@Operation(summary = "Validates the heart-beat of the API.", description = "Pings the API and check if its up and running.", tags = { "HeathCheck" })
	@RequestMapping(value = "/live", method=RequestMethod.GET)
	public @ResponseBody String live(){
		logger.info("Entering HealthController.ping() method.");
		return "Greet API is up and running at end point /health/live";
    }
    
    /**
	 * ping method is used to validate the connectivity
	 * of the API.
	 */
	@Operation(summary = "Validates the readiness of the API.", description = "Pings the API and check if its up and ready to serve requests.", tags = { "HeathCheck" })
	@RequestMapping(value = "/ready", method=RequestMethod.GET)
	public @ResponseBody String ready(){
		logger.info("Entering HealthController.ready() method.");
		return "Greet API is up and ready to serve requests at end point /health/ready";
	}
}
