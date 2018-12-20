package com.conversion.roman.numerals.utilities;

import com.conversion.roman.numerals.exception.AppException;
import com.conversion.roman.numerals.log.AppLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.conversion.roman.numerals.utilities.RomanNumeralsUtilities;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Naveen
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RomanNumeralsUtilitiesTest
{
	public final static String CLASS_KEY = "CreateClientIntegrationTest";
	@Test
	public void romanNumeralConverterUseOne() throws AppException
	{
		final String METHOD_KEY = "romanNumeralConverterUseOne";
		AppLog.debug(CLASS_KEY, METHOD_KEY, "Enter");
		assertEquals("V", RomanNumeralsUtilities.lookUpromanNumerals(Integer.parseInt("5")));
		AppLog.info(CLASS_KEY, METHOD_KEY, "Test Success");
		AppLog.debug(CLASS_KEY, METHOD_KEY, "Exit");
	}

}
