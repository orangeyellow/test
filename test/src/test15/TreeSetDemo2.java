package test15;

import java.util.Random;
import java.util.TreeSet;

/*
 * HashSet
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {

		// 创建随机对象
		Random r = new Random();

		// 创建存储集合
		TreeSet<Integer> hs = new TreeSet<Integer>();

		//循坏获取随机数，并存储到集合中
		while (hs.size() < 10) {

			int nextInt = r.nextInt(20);
			hs.add(nextInt);

		}

		//遍历集合对象
		for (Integer i : hs) {
			System.out.println(i);

		}

	}
}
