package test15;

import java.util.HashSet;
import java.util.Random;

/*
 * HashSet
 */
public class HashSetDemo {
	public static void main(String[] args) {

		// 创建随机对象
		Random r = new Random();

		// 创建存储集合
		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() < 10) {

			int nextInt = r.nextInt(20);
			hs.add(nextInt);

		}

		for (Integer i : hs) {
			System.out.println(i);

		}

	}
}
