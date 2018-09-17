package service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
	public static Date StringToDate(String date, String format) {
		if (date != null && !date.isEmpty() && date.length() > 0) {
			try {
				DateFormat dateFormat = new SimpleDateFormat(format);
				return dateFormat.parse(date);
			} catch (Exception var3) {
				var3.printStackTrace();
				return null;
			}
		} else {
			return null;
		}
	}

	public static String DateToString(Date date, String format) {
		if (date != null) {
			try {
				DateFormat dateFormat = new SimpleDateFormat(format);
				return dateFormat.format(date);
			} catch (Exception var3) {
				var3.printStackTrace();
				return "";
			}
		} else {
			return "";
		}
	}
}
