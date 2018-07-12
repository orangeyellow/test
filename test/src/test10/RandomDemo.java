package test10;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random r = new Random();

		long l1 = System.currentTimeMillis();
		for (int x = 0; x < 100000; x++) {
			// System.out.println(r.nextInt());
			System.out.println(r.nextInt(100));
		}
		long l2 = System.currentTimeMillis();

		System.out.println(l2-l1+"ºÁÃë");
	}
}
