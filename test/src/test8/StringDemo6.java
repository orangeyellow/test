package test8;

import java.util.Scanner;

public class StringDemo6 {

	public static void main(String[] args) {
//		String s1 = "";
//		String s2 = "";
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
//		s1 = sc.nextLine();
//
//		for (int x = (s1.length() - 1); x >= 0; x--) {
//
//			s2 += s1.charAt(x);
//		}
//
//		System.out.println(s2);
		
		System.out.println(stringReverse());
	}
	
	public static String stringReverse() {
		String s1 = "";
		String s2 = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		s1 = sc.nextLine();

		for (int x = (s1.length() - 1); x >= 0; x--) {

			s2 += s1.charAt(x);
		}

		return s2;
	}
}
