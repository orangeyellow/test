package test10;

import java.util.Arrays;

/*
 * 字符串："91 27 46 38 50"
 * 最终输出字符串："27 38 46 50 91"
 * 
 * 分析：
 * 	1. 定义一个字符串
 * 	2. 截取这个字符串为一个字符串数组
 *  3. 字符串数组变成int数组
 *  4. 对int数组进行排序
 *  5. 对int数组转化成字符串输出
 */
public class RegexTest {
	public static void main(String[] args) {

		// 定义一个字符串
		String s = "91 27 46 38 50";

		// 截取这个字符串为一个字符串数组
		String[] stringArray = s.split(" ");

		// 字符串数组变成int数组
		int[] i = new int[stringArray.length];

		for (int x = 0; x < stringArray.length; x++) {

			i[x] = Integer.parseInt(stringArray[x]);

		}

		// 对int数组进行排序
		Arrays.sort(i);

		// 对int数组进行字符串转换
		StringBuffer sb = new StringBuffer();

		for (int y = 0; y < i.length; y++) {
			if (y != i.length - 1) {
				sb.append(i[y]);
				sb.append(" ");
			} else {
				sb.append(i[y]);
			}
		}

		// 输出要求格式的字符串
		System.out.println(sb.toString());
	}

}
