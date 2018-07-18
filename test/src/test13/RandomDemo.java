package test13;

import java.util.ArrayList;
import java.util.Random;

/*
 * 获取10个1-20之间的随机数，且不重复
 *1. 创建一个随机数对象
 *2. 创建一个存储随机数的集合
 *3. 定义一个统计变量从0开始
 *4. 判断统计变量是否小于零
 *		是：产生一个随机数，判断随机数再集合中存不存在，如果不存在，就添加，统计变量++；
 *		否：不做处理
 *5. 遍历集合
 *
 */
public class RandomDemo {
	public static void main(String[] args) {

		// 创建一个随机数的对象
		Random r = new Random();

		// 创建一个存储随机数的集合对象
		ArrayList<Integer> array = new ArrayList<Integer>();

		// 定义一个统计变量
		int count = 0;

		// 判断统计变量是否小于零 是：产生一个随机数，判断随机数再集合中存不存在，如果不存在，就添加，统计变量++；
		while (count < 10) {
			Integer temp = r.nextInt(20) + 1;
			if (!array.contains(temp)) {
				array.add(temp);
				count++;
			}

		}

		// 遍历集合
		for (Integer i : array) {
			System.out.println(i);

		}

	}
}
