package test11;

import java.text.ParseException;
import java.util.Date;

public class DateutilTest {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		String s = DateUtil.dateToString(d, "yyyy-MM-hh");
		System.out.println(s);
		
		
		String s2 = "2018-07-12";
		
		Date d2 = DateUtil.stringToDate(s2, "yyyy-MM-hh");
		
		System.out.println(d2);
		
	}

}
