package test10;

import java.math.BigDecimal;

public class BigDecimaDemo {

	public static void main(String[] args) {

		// double add = 0.09 + 0.01;
		// System.out.println(0.09 + 0.01);
		// System.out.println(1.0 - 0.32);
		// System.out.println(1.015 * 100);
		// System.out.println(1.301 / 100);
		// System.out.println(1.0 - 0.12);
		BigDecimal b1 = new BigDecimal("0.09");
		BigDecimal b2 = new BigDecimal("0.01");
		System.out.println(b1.add(b2));
	}
}
