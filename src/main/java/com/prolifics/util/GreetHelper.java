package com.prolifics.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * GreetHelper holds the quotes which will be randomly picked by the API and
 * returned back to the caller.
 * 
 * @author Prolifics
 *
 */
public class GreetHelper {

	/**
	 * The quotes repository.
	 */
	private static List<String> quotes = Arrays.asList(new String[] {
			"The greatest glory in living lies not in never falling, but in rising every time we fall.",
			"The way to get started is to quit talking and begin doing.",
			"If life were predictable it would cease to be life, and be without flavor.",
			"Life is what happens when you're busy making other plans",
			"Don’t downgrade your dream just to fit your reality, upgrade your conviction to match your destiny.",
			"You are confined only by the walls you build yourself.",
			"Stop being afraid of what could go wrong and think of what could go right." });

	/**
	 * getRandomQuote returns a random quote from the defined repository.
	 * 
	 * @return
	 *         <p>
	 *         The desired Quote.
	 *         </p>
	 */
	public static String getRandomQuote() {
		return quotes.get(new Random().nextInt(quotes.size()));
	}

}
