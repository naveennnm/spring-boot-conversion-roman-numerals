package com.conversion.roman.numerals.dao;

import static org.junit.Assert.assertEquals;

import com.conversion.roman.numerals.exception.AppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.conversion.roman.numerals.log.AppLog;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class CreateClientIntegrationTest {

	public final static String CLASS_KEY = "CreateClientIntegrationTest";
	@Autowired
	RomanNumeralConverter romanNumeralConverter;
	@Test
	public void romanNumeralConverterUseOne() throws AppException
	{
		final String METHOD_KEY = "romanNumeralConverterUseOne";
		AppLog.debug(CLASS_KEY, METHOD_KEY, "Enter");
		assertEquals("I", romanNumeralConverter.fromRomanNumeral("1"));
		AppLog.debug(CLASS_KEY, METHOD_KEY, "Exit");
	}

}
