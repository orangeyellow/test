package test10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Date ת���� String (��ʽ��)
 * String ת����  Date (����)
 * 
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {

		// Date d = new Date();
		// SimpleDateFormat s = new SimpleDateFormat();
		// String ss = s.format(d);
		//
		// System.out.println(ss);
		
		
		//Date�ĸ�ʽ��String
		Date d = new Date();
		SimpleDateFormat ss = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");
		String s  = ss.format(d);
		System.out.println(s);
		
		Date d2 = ss.parse(s);
		System.out.println(d2);
		
	}
}
