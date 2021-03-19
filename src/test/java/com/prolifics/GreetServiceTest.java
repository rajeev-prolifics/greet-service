package com.prolifics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.prolifics.util.GreetHelper;

/**
 * GreetServiceTest is the test class to
 * hold the Unit Test Classes to be used by
 * the Microservice.
 * 
 * @author Prolifics
 *
 */
public class GreetServiceTest {
	
	/**
	 * Test to determine if Random Quote is retrieved back
	 * or not.
	 */
	@Test
	void justRadomTest() {
		Assertions.assertNotNull(GreetHelper.getRandomQuote());
	}

}
