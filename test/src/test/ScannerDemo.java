package test;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int max;
		// System.out.println("请输入一个int类型的数：");
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个int类型的数：");
		a = scan.nextInt();
		System.out.println("请输入二个int类型的数：");
		b = scan.nextInt();
		max = (a > b) ? a : b;
		System.out.println("a:" + a + "b:" + b + "最大值max:" + max);
	}

}
