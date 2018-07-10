package test8;

public class StringDemo4 {

	public static void main(String[] args) {

		String s1 = "HelloWORLD";

		String s2 = s1.substring(0, 1);
		String s3 = s1.substring(1);
		String s4 = s2.toUpperCase();
		String s5 = s3.toLowerCase();
		String s6 = s4 + s5;
		System.out.println(s6);
		System.out.println("------------------");
		
		String s7 = s1.substring(0,1).toUpperCase().concat(s1.substring(1).toLowerCase());
		System.out.println(s7);
	}
}
