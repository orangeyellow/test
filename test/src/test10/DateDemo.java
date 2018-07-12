package test10;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		System.out.println(d.getTime());
		d.setTime(1531225503539L);
		System.out.println(d.toString());
	}
	
}
