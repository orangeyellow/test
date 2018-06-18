package test;

import java.util.Scanner;

public class ForForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scen = new Scanner(System.in);
		System.out.println("---------------------");

		list(scen.nextInt());
		System.out.println("---------------------");

		star(scen.nextInt());

	}

	/*
	 * 阶梯式打印*
	 */
	public static void star(int a) {
		for (int x = 1; x <= a; x++) {

			for (int y = x; y > 1; y--) {
				System.out.print("*");
			}

			System.out.println("*");
		}

	}

	/*
	 * 九九乘法表
	 */
	public static void list(int a) {

		for (int x = 1; x <= a; x++) {

			for (int y = 1; y <= x; y++) {
				System.out.print(y + "x" + x + "=" + (x * y) + '\t');
			}

			System.out.println();

		}
	}
}
