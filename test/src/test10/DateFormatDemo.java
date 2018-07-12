package test10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Date 转化成 String (格式化)
 * String 转换成  Date (解析)
 * 
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {

		// Date d = new Date();
		// SimpleDateFormat s = new SimpleDateFormat();
		// String ss = s.format(d);
		//
		// System.out.println(ss);
		
		
		//Date的格式化String
		Date d = new Date();
		SimpleDateFormat ss = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		String s  = ss.format(d);
		System.out.println(s);
		
		Date d2 = ss.parse(s);
		System.out.println(d2);
		
	}
}
