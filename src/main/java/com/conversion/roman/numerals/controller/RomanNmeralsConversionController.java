package com.conversion.roman.numerals.controller;

import com.conversion.roman.numerals.exception.AppException;
import com.conversion.roman.numerals.log.AppLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.conversion.roman.numerals.dao.RomanNumeralConverter;
import com.conversion.roman.numerals.modal.RomanNumeralModal;

/**
 * @author Naveen
 * Use SpringMVC
 */
@Controller
public class RomanNmeralsConversionController
{
	public final static String CLASS_KEY = "RomanNmeralsConversionController";
	@Autowired
	RomanNumeralConverter romanNumeralConverter;

	/**
	 * Load Index.jsp
	 *
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView loadIndex()
	{
		final String METHOD_KEY = "loadIndex";
		AppLog.debug(CLASS_KEY, METHOD_KEY, "Enter");
		ModelAndView mav = new ModelAndView("index");
		RomanNumeralModal romanNumeral = new RomanNumeralModal();
		mav.addObject("romanNumeral", romanNumeral);
		AppLog.debug(CLASS_KEY, METHOD_KEY, "Exit");
		return mav;
	}

	/**
	 * Ajx response Method To Get RomanNumeral
	 *
	 * @param romanNumeral
	 * @return
	 * @throws AppException
	 */
	@ResponseBody
	@RequestMapping(value = "numberProcess.html", method = RequestMethod.POST)
	public String numberProcess(@RequestParam String romanNumeral) throws AppException
	{
		final String METHOD_KEY = "numberProcess";
		AppLog.debug(CLASS_KEY, METHOD_KEY, "Enter");
		AppLog.info(CLASS_KEY, METHOD_KEY, romanNumeral);
		return "Roman Numerals" + " - " + romanNumeralConverter.fromRomanNumeral(romanNumeral);
	}
}