package test12;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList
 * 底层的数据结构是数组，查询快，增删慢；
 * 线程不安全，效率高
 * 
 * Vector
 * 底层的数据结构是数组，查询快，增删慢；
 * 线程安全，效率低
 * 
 * LinkedList
 * 底层的是数据结构是链表，查询慢，增删快；
 * 线程不安全，效率高
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {

		// 创建集合对象
		ArrayList<String> arr = new ArrayList<String>();

		// 集合增加元素
		arr.add("hello");
		arr.add("world");
		arr.add("java");

		// 获取一个迭代器
		Iterator<String> ite = arr.iterator();

		// 用迭代器遍历数组
		while (ite.hasNext()) {

			String s = (String) ite.next();
			System.out.println(s);

		}
		
		System.out.println("------------");

		// 用集合本身的方法来遍历集合
		for (int x = 0; x < arr.size(); x++) {
			String s = (String) arr.get(x);
			System.out.println(s);

		}
	}
}
