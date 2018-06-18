package test;

/*
 * for循环的使用
 */
public class forDemo {

	public static void main(String[] args) {
		// System.out.println(1+2+3+4+5+6+7+8+9+10);
		System.out.println("----------------------");
		// y = 0;

		/*
		 * 1-100奇数的和
		 */
		for (int x = 1, y = 0; x <= 100; x++) {
			if (x % 2 != 0) {

				y += x;
			}
			if (x == 100) {

				System.out.println("1-100奇数的和：" + y);
			}
		}

		System.out.println("----------------------");

		/*
		 * 1-100偶数的和
		 */
		for (int x = 1, y = 0; x <= 100; x++) {
			if (x % 2 == 0) {

				y += x;
			}
			if (x == 100) {

				System.out.println("1-100偶数的和：" + y);
			}
		}

		System.out.println("----------------------");

		/*
		 * 1-100数的和
		 */

		for (int x = 1, y = 0; x <= 100; x++) {
			y += x;
			if (x == 100) {

				System.out.println("1-100数的和：" + y);
			}
		}
		System.out.println("----------------------");

		/*
		 * 5的阶乘的运算
		 */
		for (int x = 5, y = 1; x > 0; x--) {
			y = y * x;

			if (x == 1) {
				System.out.println("5的阶乘：" + y);

			}
		}

		System.out.println("----------------------");
		/*
		 * while语句的应用
		 */

		int x = 1;
		int sum = 0;
		while (x <= 10) {
			sum += x;
			++x;
		}
		System.out.println("sum:" + sum);

	}

}
