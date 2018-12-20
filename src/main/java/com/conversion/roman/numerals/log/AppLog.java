package com.conversion.roman.numerals.log;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class AppLog {
	private static Logger logger = Logger.getLogger("AppLog");

	public static void debug(String sClass, String sMethod, String sMessage) {
		AppLog.log(sClass, sMethod, sMessage, Level.DEBUG);
	}

	public static void warn(String sClass, String sMethod, String sMessage) {
		AppLog.log(sClass, sMethod, sMessage, Level.WARN);
	}

	public static void error(String sClass, String sMethod, String sMessage) {
		AppLog.log(sClass, sMethod, sMessage, Level.ERROR);
	}

	public static void info(String sClass, String sMethod, String sMessage) {
		AppLog.log(sClass, sMethod, sMessage, Level.ERROR);
	}

	public static void log(String sClass, String sMethod, String sMessage, Level sLevel) {
		if (logger.isEnabledFor(sLevel)) {
			AppLog.logger.log(sLevel, "[" + sClass + ": " + sMethod + "] " + sMessage);
		}
	}

}
