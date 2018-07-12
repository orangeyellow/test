package test11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author Administrator
 *
 */
public class DateUtil {

	private DateUtil() {
	};

	/**
	 * 
	 * @param d
	 * @param formartString
	 * @return
	 */
	public static String dateToString(Date d, String formartString) {

		return new SimpleDateFormat(formartString).format(d);
	}

	/**
	 * 
	 * @param s
	 * @param formartString
	 * @return
	 * @throws ParseException
	 */
	public static Date stringToDate(String s, String formartString) throws ParseException {

		return new SimpleDateFormat(formartString).parse(s);
	}
}
