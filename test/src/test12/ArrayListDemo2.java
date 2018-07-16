package test12;

import java.util.ArrayList;

/*
 * ArrayList中删除重复的元素
 * 思路：
 * 
 */
public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("world");
		arr.add("java");
		arr.add("hello");
		arr.add("hello");
		arr.add("hello");
		arr.add("hello");
		arr.add("1224");
		arr.add("1224");
		arr.add("1229");
		arr.add("hello");
		arr.add("hello");
		System.out.println(arr);

		for (int y = 0; y < arr.size() - 1; y++) {

			for (int x = y + 1; x < arr.size(); x++) {
				if (arr.get(y).equals(arr.get(x))) {
					arr.remove(x);
					x--;
				}

			}

		}

		System.out.println(arr);
	}
}
