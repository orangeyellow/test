package test11;

import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {

		// Scanner s = new Scanner(System.in);
		// System.out.println("请输入你的出生日期（格式：2018-07-29）：");
		// String ss = s.nextLine();
		//
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-hh");
		// Date d = sdf.parse(ss);
		// long l = d.getTime();
		// long l2 = System.currentTimeMillis();
		// long time = l2 -l;
		//
		// System.out.println(time/1000/60/60/24/365);

		// Scanner s = new Scanner(System.in);
		// System.out.println("请输入你的出生日期（格式：2018-07-29）：");
		// String ss = s.nextLine();
		// String[] stringarray = ss.split("-");
		//
		// Integer ii = Integer.decode(stringarray[0]);
		//
		// Calendar c = Calendar.getInstance();
		// c.set(Integer.decode(stringarray[0]),Integer.decode(stringarray[1]),Integer.decode(stringarray[2]));
		// long l = c.getTimeInMillis();
		// long l2 = System.currentTimeMillis();
		//
		// long time = l2 -l;
		// System.out.println(time/1000/60/60/24/365);

		Scanner s = new Scanner(System.in);
		System.out.println("请输入你的出生日期（格式：2018）：");
		int in = s.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(in, 2,1);
		c.add(Calendar.DATE, -1);
		System.out.println(c.get(Calendar.DATE));
	}

}
