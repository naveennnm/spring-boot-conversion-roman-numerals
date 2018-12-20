package com.conversion.roman.numerals.dao.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import com.conversion.roman.numerals.exception.AppException;
import com.conversion.roman.numerals.utilities.RomanNumeralsUtilities;
import org.springframework.stereotype.Repository;

import com.conversion.roman.numerals.dao.RomanNumeralConverter;
/**
 *
 * @author Naveen
 *
 */
@Repository("romanNumeralConverter")
public class RomanNumeralConverterImpl implements RomanNumeralConverter {

	@Override
	public String fromRomanNumeral(String romanNumeral) throws AppException{
		if (!romanNumeral.matches("[0-9]+") || romanNumeral.equalsIgnoreCase("0")){
			throw new AppException("Roman Numerals Cannot Be Zero Or Negative, Should Enter The Numerals >= 1");
		}
		return RomanNumeralsUtilities.lookUpromanNumerals(Integer.parseInt(romanNumeral));
	}
}
