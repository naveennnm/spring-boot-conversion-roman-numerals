package com.conversion.roman.numerals.dao;

import com.conversion.roman.numerals.exception.AppException;

/**
 * 
 * @author Naveen
 *
 */
public interface RomanNumeralConverter {
	public String fromRomanNumeral(String romanNumeral)throws AppException;
}
