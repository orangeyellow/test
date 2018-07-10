package test7;

import java.util.Scanner;

public class ScanerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt()) {
			
			int in  = sc.nextInt();
			System.out.println(in);
		}
	}
}
