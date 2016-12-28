package com.lqz.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatUtil {

	public static java.sql.Date getSQLDate(java.util.Date datetime){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(datetime);
		try {
			return (new java.sql.Date(formatter.parse(dateString).getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
